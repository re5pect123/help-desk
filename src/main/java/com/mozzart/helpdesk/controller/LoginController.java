package com.mozzart.helpdesk.controller;

import com.mozzart.helpdesk.dto.HdUserRegisterResponseDTO;
import com.mozzart.helpdesk.dto.HdUserStatusDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {

    @GetMapping("/login")
    public HdUserRegisterResponseDTO testController(@AuthenticationPrincipal final UserDetails userDetails){
        log.info("Stigao je zahtev " + userDetails);

        return new HdUserRegisterResponseDTO(HdUserStatusDTO.OK);
    }
}
