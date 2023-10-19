package com.jakubku.flowpane.flowpanelayout;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        FlowPane flowpane = new FlowPane();
        flowpane.setOrientation(Orientation.VERTICAL);
        flowpane.setHgap(10);
        flowpane.setVgap(10);
        //flowpane.setRowValignment(VPos.BOTTOM);
        flowpane.setColumnHalignment(HPos.RIGHT);
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        TextArea textarea = new TextArea();
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");
        flowpane.getChildren().addAll(button1, button2, button3, textarea, button4, button5, button6);
        Scene scene = new Scene(flowpane, 500, 450);
        stage.setScene(scene);
        stage.setTitle("FlowPane Layout Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
