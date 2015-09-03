/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosco;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Daniel
 */
public class Kiosco extends Application {

    private Scene scene;
    private final double MINIMUM_WINDOW_WIDTH = 400.0;
    private final double MINIMUM_WINDOW_HEIGHT = 300.0;

    private final double MAXIMUM_WINDOW_WIDTH = 400.0;
    private final double MAXIMUM_WINDOW_HEIGHT = 300.0;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("kiosco/fxml/FXMLLogin.fxml"));

        scene = new Scene(root);

        stage.setScene(scene);
        stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
        stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);
        stage.setMaxWidth(MAXIMUM_WINDOW_WIDTH);
        stage.setMaxHeight(MAXIMUM_WINDOW_HEIGHT);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
