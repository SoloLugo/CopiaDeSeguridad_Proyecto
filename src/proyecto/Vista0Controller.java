/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyecto;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jorge
 */
public class Vista0Controller implements Initializable {

    @FXML
    private AnchorPane Entrada;
    @FXML
    private MenuBar menuBar;
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
    @FXML
    private ImageView Logo;
    @FXML
    private Pane PlanoRedes;
    @FXML
    private ImageView Whatsapp;
    @FXML
    private ImageView Instagram;
    @FXML
    private ImageView Twitter;
    @FXML
    private Text Parrafo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GESTION(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/vistaGestion.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setTitle("Gestion");
        stage.setScene(scene);
        stage.show();

        Stage myStage = (Stage)this.Entrada.getScene().getWindow();
        myStage.close();
    }

    @FXML
    private void ALQUILER(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/vistaAlquiler.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setTitle("Alquiler");
        stage.setScene(scene);
        stage.show();

        Stage myStage = (Stage)this.Entrada.getScene().getWindow();
        myStage.close();
    }

    @FXML
    private void CERRAR(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void CLK_WP(MouseEvent event) {
        Alert msg = new Alert(Alert.AlertType.ERROR);
            msg.setHeaderText(null);
            msg.setTitle("Redes");
            msg.setContentText("seguimos trabajando en esto :D");
            msg.showAndWait();
    }

    @FXML
    private void CLK_INSTA(MouseEvent event) {
        Alert msg = new Alert(Alert.AlertType.ERROR);
            msg.setHeaderText(null);
            msg.setTitle("Redes");
            msg.setContentText("seguimos trabajando en esto :D");
            msg.showAndWait();
    }

    @FXML
    private void CLK_TWIT(MouseEvent event) {
        Alert msg = new Alert(Alert.AlertType.ERROR);
            msg.setHeaderText(null);
            msg.setTitle("Redes");
            msg.setContentText("seguimos trabajando en esto :D");
            msg.showAndWait();
    }
    
}
