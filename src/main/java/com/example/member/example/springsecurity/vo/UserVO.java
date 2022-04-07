package com.example.member.example.springsecurity.vo;

import lombok.Data;

@Data
public class UserVO {
    private int userNo;
    private String userId;
    private String userPw;
    private String userName;
    private String userAuth;
    private String appendDate;
    private String updateDate;
}