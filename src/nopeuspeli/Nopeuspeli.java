
package nopeuspeli;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;


public class Nopeuspeli extends Application {
    


    @Override
    public void start(Stage ikkuna) {
        
        // Luodaan peliolio
        Peli peli = new Peli();
        

        
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
            //Vaihdetaan aloitusnäkymästä pelinäkymään
            ikkuna.setScene(peliNakyma);
        });
        
//        Pelinäkymän napit 0-3
        Button nappi0 = new Button("1");
        nappi0.setPrefSize(30, 30);
        Button nappi1 = new Button("2");
        nappi1.setPrefSize(30, 30);
        Button nappi2 = new Button("3");
        nappi2.setPrefSize(30, 30);
        Button nappi3 = new Button("4");
        nappi3.setPrefSize(30, 30);
        
//        Luodaan nappien asettelu ja lisätään se pelinäkymään
        HBox nappienAsettelu = new HBox();
        nappienAsettelu.setAlignment(Pos.CENTER);
        nappienAsettelu.setPadding(new Insets(5,5,15,5));
        nappienAsettelu.setSpacing(15);
        nappienAsettelu.getChildren().addAll(nappi0,nappi1,nappi2,nappi3);
        peliruudunAsettelu.setBottom(nappienAsettelu);
        

        
        ikkuna.show();
    }
    
            public void keyPressed(KeyEvent e) {

    int key = e.getKeyCode();

    if (key == KeyEvent.VK_1) {
        System.out.println("Toimii");
    }

    if (key == KeyEvent.VK_RIGHT) {

    }

    if (key == KeyEvent.VK_UP) {

    }

    if (key == KeyEvent.VK_DOWN) {

    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
