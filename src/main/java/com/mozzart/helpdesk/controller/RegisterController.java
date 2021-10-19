package com.mozzart.helpdesk.controller;

import com.mozzart.helpdesk.dto.HdUserRegisterRequestDTO;
import com.mozzart.helpdesk.dto.HdUserRegisterResponseDTO;
import com.mozzart.helpdesk.service.CheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class RegisterController {

    @PostMapping("register")
    public HdUserRegisterResponseDTO register(@RequestBody HdUserRegisterRequestDTO request) {
        log.info("Zahtev za registraciju: {}", request);

        return CheckService.validation(request);
    }


}
