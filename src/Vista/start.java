package Vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class start extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    /**
     *
     * @param ventana
     * @throws Exception
     */
    @Override
    public void start(Stage ventana) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("vista0.fxml"));
        Scene scene = new Scene(root);
        ventana.setScene(scene);
        
        ventana.setTitle("Tienda_vehiculos");
        ventana.setResizable(false);
        ventana.setOnCloseRequest(event -> {event.consume();});
        
        ventana.show();
    }

}
