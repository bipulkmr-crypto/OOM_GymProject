package com.example.oom_gym;

public class Member {

    public String username,password,name,regDate,gender,email;
    public int age,dueAmount;

    public Member(String username,String password,String name,String regDate,String gender,
                  String email,int age,int dueAmount){
        this.username = username;
        this.password = password;
        this.name = name;
        this.regDate = regDate;
        this.gender = gender;
        this.email = email;
        this.age = age;
        this.dueAmount = dueAmount;
    }

}
