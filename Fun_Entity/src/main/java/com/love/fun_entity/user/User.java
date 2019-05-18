package com.love.fun_entity.user;

import lombok.Data;


@Data
public class User{

    private Integer id;

    private String name;

    private String password;

    private String photo;

    private String phone;

    private Integer balance;

    private Integer sporttime;

    private String sex;

    private String constellation;

    private String address;

    private Integer height;

    private Integer weight;

    private Integer bmi;

    private static final long serialVersionUID = 1L;
}
