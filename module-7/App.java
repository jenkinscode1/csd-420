package com.mycompany.javafxexample;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class App extends Application {

/*
 * Date: Jul 20, 2025
 * Author: Jelani Jenkins
 * Class: 402-j319
 * Teacher: Elijah Finch
 * Assignment: 11
 */



    @Override
    public void start(Stage primaryStage) {
        // Create four circles
        Circle c1 = new Circle(50);
        Circle c2 = new Circle(50);
        Circle c3 = new Circle(50);
        Circle c4 = new Circle(50);

        // Apply CSS styles
        c1.getStyleClass().add("whiteBlackStroke");
        c2.getStyleClass().add("whiteBlackStroke");

        c3.setId("redCircle");
        c4.setId("greenCircle");

        // Layout
        HBox box = new HBox(20, c1, c2, c3, c4);

        Scene scene = new Scene(box, 500, 150, Color.LIGHTGRAY);
        scene.getStylesheets().add("mystyle.css");

        primaryStage.setTitle("Circle Style Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

