package com.example.oom_gym;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Parent;
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

import java.util.Stack;


public class App extends Application {

    public Database database;
    private Stack<Parent> history;

    private Scene scene;

    public void setPage(Parent root){
        history.push(scene.getRoot());
        scene.setRoot(root);
    }

    public void goBack(){
        scene.setRoot(history.pop());
    }

    @Override
    public void start(Stage primaryStage) {
        history = new Stack<Parent>();
        database = new Database();
        GridPane current = new HomeScreen(this);
        scene = new Scene(current, 560, 800);

        primaryStage.setScene(scene);
        primaryStage.setTitle("FIT SMASH");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch();
    }

}
