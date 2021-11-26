package com.example.oom_gym;

import javafx.util.Pair;
import java.util.HashMap;
import java.sql.*;


public class Database {

    private static Connection connection;
    public  Database(){
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym")) {
            System.out.println("Connected to PostgreSQL database!");

        }  catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }

    }
    public Member getRecord(String username, String password){
//        Pair <String,String> P = new Pair <String,String> (username,password);
//        return data.get(P);
        Statement statement = null;
        Member res=null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(String.format("SELECT * FROM members where username='%s' and password='%s';", username, password));
            if (resultSet.next()) {
                res=new Member(
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("name"),
                        resultSet.getString("regdate"),
                        resultSet.getString("gender"),
                        resultSet.getString("email"),
                        resultSet.getInt("age"),
                        resultSet.getInt("dueAmount")
                        );
            }
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
        return res;

    }

    public void insertRecord(String username, String password, String name,int age,String regDate,String gender,
                             String email,int dueAmount){
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(String.format("INSERT INTO MEMBERS(username, password, name, regdate, gender, email, age, 'dueAmount') VALUES ( '%s', '%s', '%s', '%s', '%s', '%s', %d, %d);", username, password, name, regDate, gender, email, age, dueAmount));

        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        };
    }


}
