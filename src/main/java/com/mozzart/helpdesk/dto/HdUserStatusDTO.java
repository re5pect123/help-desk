package com.mozzart.helpdesk.dto;

public enum HdUserStatusDTO {

    OK("USER_OK"),
    USERNAME_TAKEN("USERNAME_TAKEN"),
    PASSWORD_USERNAME_MATCH("PASSWORD_USERNAME_MATCH"),
    PASSWORD_NOT_MATCH("PASSWORD_NOT_MATCH"),
    ERROR("ERROR");

    private String text;

    HdUserStatusDTO(String text){
        this.text = text;
    }

}
