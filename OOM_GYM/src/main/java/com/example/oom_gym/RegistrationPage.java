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


public class RegistrationPage {

    private static Label heading;
    private static Label nameLabel;
    private static Label usernameLabel;
    private static Label passwordLabel;
    private static Label ageLabel;
    private static Label regDateLabel;
    private static Label emailLabel;
    private static Label dueAmountLabel;
    private static Label genderLabel;

    private static TextField nameField;
    private static TextField usernameField;
    private static PasswordField passwordField;
    private static TextField ageField;
    private static TextField regDateField;
    private static TextField emailField;
    private static TextField dueAmountField;
    private static TextField genderField;

    private static Button submitBtn;


    private static Database userData;


    public static void RegistrationPageCreator(Stage primaryStage) {

        userData = new Database();

        heading = new Label("NEW REGISTRATION");

        submitBtn = new Button("SUBMIT");

        nameLabel = new Label("NAME");
        usernameLabel = new Label("USERNAME");
        passwordLabel = new Label("PASSWORD");
        ageLabel = new Label("AGE");
        regDateLabel = new Label("REG. DATE");
        emailLabel = new Label("EMAIL");
        dueAmountLabel = new Label("DUE AMOUNT");
        genderLabel = new Label("GENDER");

        nameField = new TextField();
        usernameField = new TextField();
        passwordField = new PasswordField();
        ageField = new TextField();
        regDateField = new TextField();
        emailField = new TextField();
        dueAmountField = new TextField();
        genderField = new TextField();


        GridPane root = new GridPane();
        Scene scene = new Scene(root, 600, 800);
        scene.getStylesheets().add("style.css");
        root.setPadding(new Insets(10, 10, 10, 10));

        ColumnConstraints column1 = new ColumnConstraints();
        RowConstraints row1 = new RowConstraints();
        column1.setPercentWidth(100);
        row1.setPercentHeight(20);
        root.getColumnConstraints().add(column1);
        root.getRowConstraints().add(row1);
        root.add(heading, 0, 0);
        root.getColumnConstraints().remove(0);
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
        root.getColumnConstraints().addAll(column1, column2);
        root.getRowConstraints().addAll(row2, row3, row4, row5, row6, row7, row8, row9);

        Label[] labels = new Label[]{nameLabel, usernameLabel, passwordLabel, ageLabel, regDateLabel, emailLabel, dueAmountLabel, genderLabel};
        TextField[] fields = new TextField[]{nameField, usernameField, usernameField, ageField, regDateField, emailField, dueAmountField, genderField};

        for (int i = 1; i <= 8; i++) {
            root.add(labels[i - 1], 0, i);
            if (i == 3) root.add(passwordField, 1, i);
            else root.add(fields[i - 1], 1, i);
        }

        submitBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                userData.insertRecord(usernameField.getText(), passwordField.getText(), nameField.getText(), Integer.parseInt(ageField.getText()),
                        regDateField.getText(), genderField.getText(), emailField.getText(), Integer.parseInt(dueAmountField.getText()));
            }
        });

        root.add(submitBtn, 0, 9);
        Button back=new Button("Back");
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String[] args;
                HomeScreen.launch();
            }
        });
        GridPane.setHalignment(submitBtn, HPos.CENTER);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Registration Page");
        primaryStage.show();

    }
}


//    public static void main(String[] args) {
//        launch();
//    }
//
//}
