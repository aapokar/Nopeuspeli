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
import javafx.scene.layout.HBox;

/**
 *
 * @author Aapo
 */
public class Nopeuspeli extends Application {

    @Override
    public void start(Stage ikkuna) {
        
//        Luodaan asettelut ja näkymät
        BorderPane alkuruudunAsettelu = new BorderPane();
        BorderPane peliruudunAsettelu = new BorderPane();
        Scene aloitusNakyma = new Scene(alkuruudunAsettelu, 200, 200);
        Scene peliNakyma = new Scene(peliruudunAsettelu, 200, 200);

//        Ensimmäisenä näytetään aloitusnäkymä
        ikkuna.setScene(aloitusNakyma);

//        Pelin aloitusnappi ja siihen toiminta
        Button aloitusNappi = new Button("Aloita peli");
        alkuruudunAsettelu.setCenter(aloitusNappi);
        aloitusNappi.setOnAction((ActionEvent event) -> {
            System.out.println("Hello");
            ikkuna.setScene(peliNakyma);
        });
        
//        Pelinäkymän napit 0-3
        Button nappi0 = new Button("1");
        Button nappi1 = new Button("2");
        Button nappi2 = new Button("3");
        Button nappi3 = new Button("4");
        
//        Luodaan nappien asettelu ja lisätään se pelinäkymään
        HBox nappienAsettelu = new HBox();
        nappienAsettelu.getChildren().addAll(nappi0,nappi1,nappi2,nappi3);
        peliruudunAsettelu.setBottom(nappienAsettelu);
        
        ikkuna.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
