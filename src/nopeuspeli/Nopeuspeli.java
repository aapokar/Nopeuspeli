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
        BorderPane alkuruudunAsettelu = new BorderPane();
        BorderPane peliruudunAsettelu = new BorderPane();
        Scene aloitusNakyma = new Scene(alkuruudunAsettelu, 200, 200);
        Scene peliNakyma = new Scene(peliruudunAsettelu, 200, 200);
        ikkuna.setScene(aloitusNakyma);

        Button aloitusNappi = new Button("Aloita peli");
        alkuruudunAsettelu.setCenter(aloitusNappi);
        aloitusNappi.setOnAction((ActionEvent event) -> {
            System.out.println("Hello");
            ikkuna.setScene(peliNakyma);
        });

        ikkuna.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
