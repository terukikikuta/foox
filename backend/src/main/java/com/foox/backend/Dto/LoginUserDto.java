package com.foox.backend.Dto;

import java.beans.JavaBean;

import lombok.Data;

@JavaBean
@Data
public class LoginUserDto {

    String userName;
    String passWord;

}