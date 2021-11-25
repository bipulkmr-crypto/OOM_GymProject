package com.example.oom_gym;

import com.example.oom_gym.Database;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class HomeScreen extends Application {

    private Database userData;
    private Label heading;
    private Button exercisePlans;
    private Button userLogin;
    private Button adminLogin;
    private Button registrationPage;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;



    @Override
    public void start(Stage primaryStage) {

        userData = new Database();

        heading = new Label("FitSmash");
        heading.setTextAlignment(TextAlignment.CENTER);
        heading.setFont(new Font("Arial",63));

        img1 = new ImageView();
        Image i1 = new Image(getClass().getResourceAsStream("exercise.jpg"));
        img1.setImage(i1);
        exercisePlans = new Button("Exercise Plans",img1);
        exercisePlans.setContentDisplay(ContentDisplay.TOP);
        exercisePlans.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
            Plans.displayPlans(primaryStage);
            }
        });
        img2 = new ImageView();
        Image i2 = new Image(getClass().getResourceAsStream("register.png"));
        img2.setImage(i2);
        registrationPage = new Button("Register",img2);
        registrationPage.setContentDisplay(ContentDisplay.TOP);
        registrationPage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                RegistrationPage.RegistrationPageCreator(primaryStage);
            }
        });

        img3 = new ImageView();
        Image i3 = new Image(getClass().getResourceAsStream("adminL.jpg"));
        img3.setImage(i3);
        adminLogin = new Button("Admin Login",img3);
        adminLogin.setContentDisplay(ContentDisplay.TOP);
        adminLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                AdminLogin.createAdminLogin(primaryStage);
            }
        });

        img4 = new ImageView();
        Image i4 = new Image(getClass().getResourceAsStream("userL.jpg"));
        img4.setImage(i4);
        userLogin = new Button("User Login",img4);
        userLogin.setContentDisplay(ContentDisplay.TOP);
        userLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                UserLogin.start(primaryStage);
            }
        });

        GridPane root = new GridPane();
        Scene scene = new Scene(root, 560, 800);
        scene.getStylesheets().add("style.css");
        root.setPadding(new Insets(10,10,10,10));

        ColumnConstraints column1 = new ColumnConstraints();
        RowConstraints row1 = new RowConstraints();
        column1.setPercentWidth(100);
        row1.setPercentHeight(20);
        root.getColumnConstraints().add(column1);
        root.getRowConstraints().add(row1);
        root.add(heading,0,0);
        GridPane.setHalignment(heading, HPos.CENTER);
        root.getColumnConstraints().remove(0);

        column1.setPercentWidth(50);
        ColumnConstraints column2 = new ColumnConstraints();
        RowConstraints row2 = new RowConstraints();
        RowConstraints row3 = new RowConstraints();
        column2.setPercentWidth(50);
        row2.setPercentHeight(40);
        row3.setPercentHeight(40);
        root.getColumnConstraints().addAll(column1,column2);
        root.getRowConstraints().addAll(row2,row3);


        root.add(exercisePlans,0,1);
        root.add(registrationPage,1,1);
        root.add(userLogin,0,2);
        root.add(adminLogin,1,2);

        primaryStage.setScene(scene);
        primaryStage.setTitle("FITSMASH");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch();
    }

}
