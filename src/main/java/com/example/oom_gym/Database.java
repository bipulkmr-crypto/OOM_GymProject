package com.example.oom_gym;

import javafx.util.Pair;
import java.util.HashMap;

public class Database {

    private HashMap<Pair <String,String> , Member> data = new HashMap<Pair <String,String> , Member> ();

    public Member getRecord(String username, String password){
        Pair <String,String> P = new Pair <String,String> (username,password);
        return data.get(P);
    }

    public void insertRecord(String username, String password, String name,int age,String regDate,String gender,
                             String email,int dueAmount){
        Pair <String,String> P = new Pair <String,String> (username,password);
        Member newUser = new Member(username,password,name,regDate,gender,email,age,dueAmount);
        data.put(P,newUser);
        return ;
    }

    public void deleteRecord(String username,String password){
        Pair <String,String> P = new Pair <String,String> (username,password);
        data.remove(P);
    }

    public void changeUsername(String username,String password,String newUsername){
        Pair <String,String> P1 = new Pair <String,String> (username,password);
        Member user = data.get(P1);
        user.username = newUsername;
        data.remove(P1);
        Pair <String,String> P2 = new Pair <String,String> (newUsername,password);
        data.put(P2,user);
    }

    public void changePassword(String username,String password,String newPassword){
        Pair <String,String> P1 = new Pair <String,String> (username,password);
        Member user = data.get(P1);
        user.password = newPassword;
        data.remove(P1);
        Pair <String,String> P2 = new Pair <String,String> (username,newPassword);
        data.put(P2,user);
    }

    public void changeName(String username,String password,String newName){
        Pair <String,String> P1 = new Pair <String,String> (username,password);
        Member user = data.get(P1);
        user.name = newName;
        data.put(P1,user);
    }

    public void changeGender(String username,String password,String newGender){
        Pair <String,String> P1 = new Pair <String,String> (username,password);
        Member user = data.get(P1);
        user.gender = newGender;
        data.put(P1,user);
    }

    public void changeAge(String username,String password,int newAge){
        Pair <String,String> P1 = new Pair <String,String> (username,password);
        Member user = data.get(P1);
        user.age = newAge;
        data.put(P1,user);
    }

    public void changeEmail(String username,String password,String newEmail){
        Pair <String,String> P1 = new Pair <String,String> (username,password);
        Member user = data.get(P1);
        user.email = newEmail;
        data.put(P1,user);
    }

    public void changeDueAmount(String username,String password,int newDueAmount){
        Pair <String,String> P1 = new Pair <String,String> (username,password);
        Member user = data.get(P1);
        user.dueAmount = newDueAmount;
        data.put(P1,user);
    }

    public void changeRegDate(String username,String password,String newRegDate){
        Pair <String,String> P1 = new Pair <String,String> (username,password);
        Member user = data.get(P1);
        user.regDate = newRegDate;
        data.put(P1,user);
    }

}
