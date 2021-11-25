package com.example.oom_gym;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class App extends Application {

    public Database database;
    private GridPane current, back;
    private Scene scene;

    public void setScene(GridPane root){
        scene.setRoot(root);
        back=current;
        current=root;
    }

    @Override
    public void start(Stage primaryStage) {

        database = new Database();
        current=new HomeScreen(this);
        scene = new Scene(current, 560, 800);

        primaryStage.setScene(scene);
        primaryStage.setTitle("FITSMASH");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch();
    }

}
