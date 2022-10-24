/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

/**
 * FXML Controller class
 *
 * @author jorge
 */
public class Vista0Controller implements Initializable {

    @FXML
    private Menu BTN_operaciones;
    @FXML
    private MenuItem BTN_gestion;
    @FXML
    private MenuItem BTN_alquiler;
    @FXML
    private Menu BTN_salir;
    @FXML
    private MenuItem BTN_gestion1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GESTION(ActionEvent event) {
    }

    @FXML
    private void ALQUILER(ActionEvent event) {
    }

    @FXML
    private void CERRAR(ActionEvent event) {
        System.exit(0);
    }
    
}
