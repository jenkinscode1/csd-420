/**
 *
 * Author: Jelani Jenkins
 * Date: Aug 17, 2025
 * Class Name: Advanced Java for Programmers
 * Teacher: Elijah Finch
 */


package com.mycompany.randomcardapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class App extends Application {

    private HBox cardBox;

    @Override
    public void start(Stage primaryStage) {
        
        // organizing my layout //
        
        cardBox = new HBox(10);
        cardBox.setStyle("-fx-alignment: center;");
        Button refreshBtn = new Button("Refresh");
        
        VBox root = new VBox(15, cardBox, refreshBtn);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");
        
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Random Card Display");
        primaryStage.setScene(scene);
  
        
        // My Lambda Expression will refresh the card deck
        refreshBtn.setOnAction(e -> showRandomCards()); 
        
        // display the deck
        showRandomCards();       
        
        primaryStage.show();   

    }

    private void showRandomCards() {
        cardBox.getChildren().clear();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 54; i++) {
            numbers.add(i);
        }
        
        Collections.shuffle(numbers);  //action that randomizes the deck of cards

        for (int i = 0; i < 4; i++) {
            String imagePath = "cards" + File.separator + numbers.get(i) + ".png";
            
            ImageView cardView = new ImageView(new Image(new File(imagePath).toURI().toString()));
            cardView.setFitHeight(150);
            cardView.setPreserveRatio(true);
            cardBox.getChildren().add(cardView);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}