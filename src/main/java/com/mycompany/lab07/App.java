package com.mycompany.lab07;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.animation.PathTransition;
import javafx.scene.paint.Paint;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;

//https://github.com/BoomEAE/Lab07.git

/**
 * JavaFX App
 * @author Eric Andre Evsei
 */
public class App extends Application {

    @Override
    public void start(Stage mainStage) {
        
        //Pane for layout
        Pane root = new Pane();
        
        //Buttons
        Button start = new Button();
        Button reset = new Button();
        Button exit = new Button();
        
        //Shapes
        Circle objectA = new Circle(20, 20, 20);
        
        //Lines (the different paths)
        Line mToN = new Line();
        Line nToP = new Line();
        Line pToQ = new Line();
        Line qToM = new Line();
        
        //A PathTransition and its setup
        PathTransition pt = new PathTransition();
        
        //Add the shape to the root
        root.getChildren().addAll(objectA);
        
        //Scene and stage setup
        Scene scene = new Scene(root, 400, 400);
        mainStage.setScene(scene);
        mainStage.show();
        
    }

    public static void main(String[] args) {
        launch();
    }

}