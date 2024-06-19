package com.photon.user.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserDTO implements Serializable {

    private int UserId;

    private String userFirstName;

    private String userLastName;

    private String userEmailId;

    private int userMobileNumber;

    private String userGender;

    private String userDOB;
}
