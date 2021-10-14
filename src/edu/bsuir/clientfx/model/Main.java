package edu.bsuir.clientfx.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../gui/sample.fxml"));
        primaryStage.setTitle("Client");
        primaryStage.setScene(new Scene(root, 732, 506));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
