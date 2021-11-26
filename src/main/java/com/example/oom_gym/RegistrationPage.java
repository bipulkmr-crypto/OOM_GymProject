package com.example.oom_gym;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;


public class RegistrationPage extends GridPane{

    private static App app;
    private static TextField nameField;
    private static TextField usernameField;
    private static PasswordField passwordField;
    private static TextField ageField;
    private static TextField regDateField;
    private static TextField emailField;
    private static TextField dueAmountField;
    private static TextField genderField;

    public  RegistrationPage (App app) {
        super();
        this.app = app;

        Label heading = new Label("NEW REGISTRATION");

        Button submitBtn = new Button("SUBMIT");

        Label nameLabel = new Label("NAME");
        Label usernameLabel = new Label("USERNAME");
        Label passwordLabel = new Label("PASSWORD");
        Label ageLabel = new Label("AGE");
        Label regDateLabel = new Label("REG. DATE");
        Label emailLabel = new Label("EMAIL");
        Label dueAmountLabel = new Label("DUE AMOUNT");
        Label genderLabel = new Label("GENDER");

        nameField = new TextField();
        usernameField = new TextField();
        passwordField = new PasswordField();
        ageField = new TextField();
        regDateField = new TextField();
        emailField = new TextField();
        dueAmountField = new TextField();
        genderField = new TextField();


        ColumnConstraints column1 = new ColumnConstraints();
        RowConstraints row1 = new RowConstraints();
        column1.setPercentWidth(100);
        row1.setPercentHeight(20);
        getColumnConstraints().add(column1);
        getRowConstraints().add(row1);
        add(heading, 0, 0);
        getColumnConstraints().remove(0);
        GridPane.setHalignment(heading, HPos.CENTER);

        column1.setPercentWidth(50);
        ColumnConstraints column2 = new ColumnConstraints();
        RowConstraints row2 = new RowConstraints();
        RowConstraints row3 = new RowConstraints();
        RowConstraints row4 = new RowConstraints();
        RowConstraints row5 = new RowConstraints();
        RowConstraints row6 = new RowConstraints();
        RowConstraints row7 = new RowConstraints();
        RowConstraints row8 = new RowConstraints();
        RowConstraints row9 = new RowConstraints();
        RowConstraints row10 = new RowConstraints();
        column2.setPercentWidth(50);
        row2.setPercentHeight(9);
        row3.setPercentHeight(9);
        row4.setPercentHeight(9);
        row5.setPercentHeight(9);
        row6.setPercentHeight(9);
        row7.setPercentHeight(9);
        row8.setPercentHeight(9);
        row9.setPercentHeight(9);
        row10.setPercentHeight(8);
        getColumnConstraints().addAll(column1, column2);
        getRowConstraints().addAll(row2, row3, row4, row5, row6, row7, row8, row9);

        Label[] labels = new Label[]{nameLabel, usernameLabel, passwordLabel, ageLabel, regDateLabel, emailLabel, dueAmountLabel, genderLabel};
        TextField[] fields = new TextField[]{nameField, usernameField, usernameField, ageField, regDateField, emailField, dueAmountField, genderField};

        for (int i = 1; i <= 8; i++) {
           add(labels[i - 1], 0, i);
            if (i == 3) add(passwordField, 1, i);
            else add(fields[i - 1], 1, i);
        }

        submitBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                app.database.insertRecord(usernameField.getText(), passwordField.getText(), nameField.getText(), Integer.parseInt(ageField.getText()),
                        regDateField.getText(), genderField.getText(), emailField.getText(), Integer.parseInt(dueAmountField.getText()));
                for(int i = 0; i < 8; i ++) fields[i].clear();
                passwordField.clear();
            }
        });

        add(submitBtn, 0, 9);
        Button back=new Button("Back");
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                app.goBack();
            }
        });
        add(back,1,9);
        GridPane.setHalignment(submitBtn, HPos.CENTER);


    }
}


//    public static void main(String[] args) {
//        launch();
//    }
//
//}
