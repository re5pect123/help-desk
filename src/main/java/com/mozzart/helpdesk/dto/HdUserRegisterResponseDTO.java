package com.mozzart.helpdesk.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class HdUserRegisterResponseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private HdUserStatusDTO status;

}
