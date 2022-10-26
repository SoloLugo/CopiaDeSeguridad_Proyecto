/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyecto;

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jorge
 */
public class VistaGestionController implements Initializable {

    @FXML
    private Pane objetosPane;
    @FXML
    private RadioButton RBTN_carro;
    @FXML
    private RadioButton RBTN_moto;
    @FXML
    private RadioButton RBTN_cliente;
    @FXML
    private Button BTN_regresar;
    @FXML
    private Button BTN_ingresarNuevo;
    @FXML
    private Button BTN_buscarAlguno;
    @FXML
    private Button BTN_verTodos;
    @FXML
    private Button BTN_modificar;
    @FXML
    private Button BTN_eliminar;
    @FXML
    private TitledPane Pane_operaciones;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void getBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/vista0.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setTitle("Tienda");
        stage.setScene(scene);
        stage.show();

        Stage myStage = (Stage)this.objetosPane.getScene().getWindow();
        myStage.close();
    }

    @FXML
    private void INGRESA_NUEVO(ActionEvent event) {
    }

    @FXML
    private void BUSCAR_ALGUNO(ActionEvent event) {
    }

    @FXML
    private void VER_TODOS(ActionEvent event) {
    }

    @FXML
    private void MODIFICAR(ActionEvent event) {
    }

    @FXML
    private void ELIMINAR(ActionEvent event) {
    }

    @FXML
    private void CRUD_CARRO(MouseEvent event) {
        if (this.RBTN_carro.isSelected()){
            this.Pane_operaciones.setExpanded(true);
            this.Pane_operaciones.setDisable(false);
        }
        else{
            this.Pane_operaciones.setExpanded(false);
            this.Pane_operaciones.setDisable(true);
        }
    }

    @FXML
    private void CRUD_MOTO(MouseEvent event) {
        if (this.RBTN_moto.isSelected()){
            this.Pane_operaciones.setExpanded(true);
            this.Pane_operaciones.setDisable(false);
        }
        else{
            this.Pane_operaciones.setExpanded(false);
            this.Pane_operaciones.setDisable(true);
        }
    }

    @FXML
    private void CRUD_CLIENTE(MouseEvent event) {
        if (this.RBTN_cliente.isSelected()){
            this.Pane_operaciones.setExpanded(true);
            this.Pane_operaciones.setDisable(false);
        }
        else{
            this.Pane_operaciones.setExpanded(false);
            this.Pane_operaciones.setDisable(true);
        }
    }
    
}
