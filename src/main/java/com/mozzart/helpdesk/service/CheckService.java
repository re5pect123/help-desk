package com.mozzart.helpdesk.service;

import com.mozzart.helpdesk.dto.HdUserRegisterRequestDTO;
import com.mozzart.helpdesk.dto.HdUserRegisterResponseDTO;
import com.mozzart.helpdesk.dto.HdUserStatusDTO;

public class CheckService {

    public static HdUserRegisterResponseDTO validation(HdUserRegisterRequestDTO registerRequest) {

        /**
         * proverava da li je username zauzet i da li je password isti
         * ukoliko je username slobodan i password isti onda je registracija u redu
         */
        if (isUsernameNotExist(registerRequest) && isPasswordMatch(registerRequest)) {
            return new HdUserRegisterResponseDTO(HdUserStatusDTO.OK);
        }

        if (isUsernameExist(registerRequest)) {
            return new HdUserRegisterResponseDTO(HdUserStatusDTO.USERNAME_TAKEN);
        }

        if (isPasswordNotMatch(registerRequest)) {
            return new HdUserRegisterResponseDTO(HdUserStatusDTO.PASSWORD_NOT_MATCH);
        }

        return new HdUserRegisterResponseDTO(HdUserStatusDTO.ERROR);
    }

    private static boolean isUsernameExist(HdUserRegisterRequestDTO registerRequest) {
        return registerRequest.getUsername().equals("test");
    }

    private static boolean isUsernameNotExist(HdUserRegisterRequestDTO registerRequest) {
        return !registerRequest.getUsername().equals("test");
    }

    private static boolean isPasswordMatch(HdUserRegisterRequestDTO registerRequest) {
        return registerRequest.getPassword().equals(registerRequest.getRepeatablePassword());
    }

    private static boolean isPasswordNotMatch(HdUserRegisterRequestDTO registerRequest) {
        return !registerRequest.getPassword().equals(registerRequest.getRepeatablePassword());
    }

}
