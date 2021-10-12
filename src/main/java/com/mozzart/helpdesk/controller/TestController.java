package com.mozzart.helpdesk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/test")
    public String testController(@AuthenticationPrincipal final UserDetails userDetails){
        log.info("Stigao je zahtev");

        String username = userDetails.getUsername();
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        authorities.stream()
                        .forEach(System.out::println);

        return "OK";
    }
}
