package com.mozzart.helpdesk.dto;

import lombok.Data;

@Data
public class HdUserRegisterRequestDTO {

    String username;
    String password;
    String repeatablePassword;

}
