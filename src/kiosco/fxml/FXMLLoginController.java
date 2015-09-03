/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiosco.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import kiosco.validators.UserValidator;

/**
 * FXML Controller class
 *
 * @author Daniel
 */
public class FXMLLoginController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button aceptar;
    @FXML
    private TextField password;
    @FXML
    private TextField usuario;

    private UserValidator validador;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        validador = new UserValidator(usuario.getText(), password.getText());
        String mensaje = validador.ValidarUsuario();
        if (mensaje.equalsIgnoreCase("Acceso denegado, usuario no conocido.")) {
            label.setText(mensaje);
            label.setStyle("-fx-text-fill: #DC2222");
            label.setStyle("-fx-background-color: #ff0000");
        } else {
            changeScene();
        }
    }

    public void changeScene() throws IOException {
        //password.getScene().getRoot();
        Stage stage;
        Parent root;
        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("kiosco/fxml/FXMLDocument.fxml"));
        //Parent root = 
        stage = (Stage) password.getScene().getWindow();
        root = FXMLLoader.load(getClass().getClassLoader().getResource("kiosco/fxml/FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setMinWidth(600);
        stage.setMinHeight(600);
        stage.setMaxWidth(600);
        stage.setMaxHeight(600);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
