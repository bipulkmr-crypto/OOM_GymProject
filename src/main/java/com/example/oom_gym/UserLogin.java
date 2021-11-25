package com.example.oom_gym;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class UserLogin extends GridPane{

    private static TextField usernameField;
    private static PasswordField passwordField;

    private static Stage stage2;
    private static App app;
    private static Scene scene2;


    public  UserLogin(App app) {
        this.app = app;
        app.database.insertRecord("IIT2020028","vibhug507","Vibhu Garg",19,
                "2021-11-23","Male","iit2020028@iiita.ac.in",10000);

        GridPane root = new GridPane();
        Scene scene = new Scene(root, 600, 800);
        scene.getStylesheets().add("style.css");

        root.setPadding(new Insets(10,10,10,10));

        ImageView img = new ImageView();

        Image img1 = new Image(UserLogin.class.getResourceAsStream("user.png"));

        img.setImage(img1);

        Label heading = new Label("LOGIN");
        Button okBtn = new Button("OK");
        Button clearBtn = new Button("Clear");
        Label usernameLabel = new Label("USERNAME");
        Label passwordLabel = new Label("PASSWORD");
        usernameField = new TextField();
        passwordField = new PasswordField();

        okBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // TODO
            }
        });

        clearBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                passwordField.clear();
                usernameField.clear();
            }
        });


        ColumnConstraints column1 = new ColumnConstraints();
        RowConstraints row1 = new RowConstraints();
        column1.setPercentWidth(100);
        row1.setPercentHeight(40);
        root.getColumnConstraints().add(column1);
        root.getRowConstraints().add(row1);
        root.add(img,0,0,2,1);
        root.getColumnConstraints().remove(0);
        GridPane.setHalignment(img, HPos.CENTER);



        column1.setPercentWidth(50);
        ColumnConstraints column2 = new ColumnConstraints();
        RowConstraints row2 = new RowConstraints();
        RowConstraints row3 = new RowConstraints();
        column2.setPercentWidth(50);
        row2.setPercentHeight(25);
        row3.setPercentHeight(25);
        root.getColumnConstraints().addAll(column1,column2);
        root.getRowConstraints().addAll(row2,row3);


        root.add(usernameLabel,0,1);
        root.add(usernameField,1,1);
        root.add(passwordLabel,0,2);
        root.add(passwordField,1,2);
        root.add(okBtn,0,3);
        root.add(clearBtn,1,3);


        GridPane.setHalignment(usernameLabel, HPos.CENTER);
        GridPane.setHalignment(passwordLabel, HPos.CENTER);
        GridPane.setHalignment(okBtn, HPos.RIGHT);
        GridPane.setHalignment(clearBtn, HPos.LEFT);

        Button back=new Button("Back");
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                app.goBack();
            }
        });

        RowConstraints row4 = new RowConstraints();
        root.getRowConstraints().add(row4);
        root.add(back,0,4);

        root.setHgap(10);
        root.setVgap(10);
    }


//    public static void main(String[] args) {
//        launch();
//    }
}