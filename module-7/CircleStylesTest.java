package com.mycompany.javafxexample;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import javafx.scene.shape.Circle;
/*
 * Date: Sep 21, 2025
 * Author: Jelani Jenkins
 * Class: 402-j319
 * Teacher: Elijah Finch
 * Assignment: 
 */


public class CircleStylesTest {


    public void testCircleStyles() {
        // Initialize JavaFX runtime
        new JFXPanel();

        Circle c1 = new Circle(50);
        c1.getStyleClass().add("whiteBlackStroke");

        Circle c2 = new Circle(50);
        c2.setId("redCircle");

        assertTrue(c1.getStyleClass().contains("whiteBlackStroke"));
        assertEquals("redCircle", c2.getId());
    }
}