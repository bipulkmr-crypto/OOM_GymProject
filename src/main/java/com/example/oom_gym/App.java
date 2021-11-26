package com.example.oom_gym;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Properties;
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
