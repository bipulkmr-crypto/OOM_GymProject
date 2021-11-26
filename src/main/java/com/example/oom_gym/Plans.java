package com.example.oom_gym;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class Plans extends GridPane{

    public static App app;

    public Plans(App app) {
        this.app = app;
        Label name = new Label("Name");
        Label Price = new Label("Price");
        Label plan1 = new Label("Beginners Delight");
        Label plan2 = new Label("Athlete's Summit");
        Label plan3 = new Label("Beast Plan");
        Label price1 = new Label("1000 only per month");
        Label price2 = new Label("1500 only per month");
        Label price3 = new Label("2000 only per month");
        ColumnConstraints column1 = new ColumnConstraints();
        ColumnConstraints column2 = new ColumnConstraints();
        RowConstraints row1 = new RowConstraints();
        column1.setPercentWidth(50);
        column2.setPercentWidth(50);
        row1.setPercentHeight(40);
        getColumnConstraints().addAll(column1,column2);
        getRowConstraints().add(row1);
        add(name,0,0);
        add(Price,1,0);
        getRowConstraints().remove(0);
        RowConstraints row2 = new RowConstraints();
        RowConstraints row3 = new RowConstraints();
        RowConstraints row4 = new RowConstraints();
        RowConstraints row5 = new RowConstraints();

        row2.setPercentHeight(20);
        row3.setPercentHeight(20);
        row4.setPercentHeight(20);
        row5.setPercentHeight(20);

        getRowConstraints().addAll(row2, row3, row4, row5);
        add(plan1, 0, 1);
        add(price1, 1, 1);
        add(plan2, 0, 2);
        add(price2, 1, 2);
        add(plan3, 0, 3);
        add(price3, 1, 3);
        Button back=new Button("Back");
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                app.goBack();
            }
        });

        add(back,0,4);

        setPadding(new Insets(10,10,10,10));


    }

}
