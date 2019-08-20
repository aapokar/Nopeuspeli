/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nopeuspeli;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Aapo
 */
public class Nopeuspeli extends Application {
    
    @Override
    public void start(Stage ikkuna) {
        BorderPane asettelu = new BorderPane();
        Scene nakyma = new Scene(asettelu, 200,200);
        ikkuna.setScene(nakyma);
        
        ikkuna.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
