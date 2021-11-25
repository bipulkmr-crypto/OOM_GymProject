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

// Admin Password is "OOM_C3"

public class AdminLogin extends GridPane {

    private static App app;
    private static TextField usernameField;
    private static PasswordField passwordField;
    private static PasswordField adminPasswordField;

    private static Database userData;


    public void createStage2(String username, String password) {

        getChildren().clear();

        Member user = app.database.getRecord(username, password);

        Label USERNAMEL = new Label("USERNAME");
        TextField USERNAMER = new TextField(user.username);
        Label PASSWORDL = new Label("PASSWORD");
        TextField PASSWORDR = new TextField(user.password);
        Label NAMEL = new Label("NAME");
        TextField NAMER = new TextField(user.name);
        Label EMAILL = new Label("EMAIL");
        TextField EMAILR = new TextField(user.email);
        Label AGEL = new Label("AGE");
        TextField AGER = new TextField(Integer.toString(user.age));
        Label GENDERL = new Label("Gender");
        TextField GENDERR = new TextField(user.gender);
        Label DUEAMOUNTL = new Label("DUE AMOUNT");
        TextField DUEAMOUNTR = new TextField(Integer.toString(user.dueAmount));
        Label REGDATEL = new Label("REG. DATE");
        TextField REGDATER = new TextField(user.regDate);

        Button submitBtn = new Button("SUBMIT");
        submitBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                userData.insertRecord(USERNAMER.getText(),
                        PASSWORDR.getText(),
                        NAMER.getText(),
                        Integer.parseInt(AGER.getText()),
                        REGDATER.getText(),
                        GENDERR.getText(),
                        EMAILR.getText(),
                        Integer.parseInt(DUEAMOUNTR.getText()));
            }
        });

        ColumnConstraints column1 = new ColumnConstraints();
        RowConstraints row1 = new RowConstraints();
        column1.setPercentWidth(100);
        row1.setPercentHeight(20);
        getColumnConstraints().add(column1);
        getRowConstraints().add(row1);
        Label head = new Label("USER DETAILS");
        add(head, 0, 0);
        getColumnConstraints().remove(0);
        GridPane.setHalignment(head, HPos.CENTER);

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
        row10.setPercentHeight(9);
        getColumnConstraints().addAll(column1,column2);
        getRowConstraints().addAll(row2,row3,row4,row5,row6,row7,row8,row9,row10);

        // ADD ROW 10 JUST AFTER ROW 9

        Label[] labels = new Label[] {NAMEL,USERNAMEL,PASSWORDL,EMAILL,GENDERL,AGEL,REGDATEL, DUEAMOUNTL};
        TextField[] fields = new TextField[] {NAMER,USERNAMER,PASSWORDR,EMAILR,GENDERR,AGER,REGDATER,DUEAMOUNTR};

        for(int i = 1; i <= 8; i++){
            add(labels[i-1],0,i);
            add(fields[i-1],1,i);
        }

        add(submitBtn,0,9);

        Button back=new Button("Back");
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String[] args;
                app.goBack();
            }
        });
        add(back,1,9);


        setPadding(new Insets(10, 10, 10, 10));

    }


    //    @Override
    public AdminLogin(App app) {
        super();
        this.app = app;
        app.database.insertRecord("IIT2020028", "vibhug507", "Vibhu Garg", 19,
                "2021-11-23", "Male", "iit2020028@iiita.ac.in", 10000);


        setPadding(new Insets(10, 10, 10, 10));

        ImageView img = new ImageView();

        Image img1 = new Image(AdminLogin.class.getResourceAsStream("user.png"));

        img.setImage(img1);

        Label heading = new Label("LOGIN");
        Button okBtn = new Button("OK");
        Button clearBtn = new Button("Clear");
        Label usernameLabel = new Label("USERNAME");
        Label passwordLabel = new Label("PASSWORD");
        Label adminPasswordLabel = new Label("ADMIN PASSWORD");
        usernameField = new TextField();
        passwordField = new PasswordField();
        adminPasswordField = new PasswordField();

        okBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (adminPasswordField.getText().equals("OOM_C3"))
                    createStage2(usernameField.getText(), passwordField.getText());
            }
        });

        clearBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                passwordField.clear();
                usernameField.clear();
                adminPasswordField.clear();
            }
        });


        ColumnConstraints column1 = new ColumnConstraints();
        RowConstraints row1 = new RowConstraints();
        column1.setPercentWidth(100);
        row1.setPercentHeight(40);
        getColumnConstraints().add(column1);
        getRowConstraints().add(row1);
        add(img, 0, 0, 2, 1);
        getColumnConstraints().remove(0);
        GridPane.setHalignment(img, HPos.CENTER);


        column1.setPercentWidth(50);
        ColumnConstraints column2 = new ColumnConstraints();
        RowConstraints row2 = new RowConstraints();
        RowConstraints row3 = new RowConstraints();
        RowConstraints row4 = new RowConstraints();
        RowConstraints row5 = new RowConstraints();
        column2.setPercentWidth(50);
        row2.setPercentHeight(15);
        row3.setPercentHeight(15);
        row4.setPercentHeight(15);
        row5.setPercentHeight(15);
        getColumnConstraints().addAll(column1, column2);
        getRowConstraints().addAll(row2, row3, row4, row5);


        add(usernameLabel, 0, 1);
        add(usernameField, 1, 1);
        add(passwordLabel, 0, 2);
        add(passwordField, 1, 2);
        add(adminPasswordLabel, 0, 3);
        add(adminPasswordField, 1, 3);
        add(okBtn, 0, 4);
        add(clearBtn, 1, 4);

        GridPane.setHalignment(usernameLabel, HPos.CENTER);
        GridPane.setHalignment(passwordLabel, HPos.CENTER);
        GridPane.setHalignment(adminPasswordLabel, HPos.CENTER);
        GridPane.setHalignment(okBtn, HPos.RIGHT);
        GridPane.setHalignment(clearBtn, HPos.LEFT);

        setHgap(10);
        setVgap(10);

    }


//    public static void main(String[] args) {
//        launch();
//    }
}