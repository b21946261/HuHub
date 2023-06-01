package com.Techtacular5.HuHub.requests;

import lombok.Data;

@Data
public class UserLoginRequest {
    String email;
    String password;
}
