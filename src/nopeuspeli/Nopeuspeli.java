package nopeuspeli;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javafx.application.Application;
import javafx.event.ActionEvent;
//import javafx.scene.image.
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.animation.AnimationTimer;
import java.util.ArrayList;
import javafx.scene.input.KeyCode;
import java.util.concurrent.atomic.AtomicInteger;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Paint;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
 

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
        
        //Pelin napit luodaan Nappi-olioina ja lisätään listaan hallittavuuden parantamiseksi.
        Nappi nappi0 = new Nappi("/kuvat/punnappi.png");
        Nappi nappi1 = new Nappi("/kuvat/kelnappi.png");
        Nappi nappi2 = new Nappi("/kuvat/sinnappi.png");
        Nappi nappi3 = new Nappi("/kuvat/vihnappi.png");
        ArrayList<Nappi> napit = new ArrayList<Nappi>();
        napit.add(nappi0);
        napit.add(nappi1);
        napit.add(nappi2);
        napit.add(nappi3);

//        Luodaan nappien asettelu ja lisätään se pelinäkymään
        HBox nappienAsettelu = new HBox();
        nappienAsettelu.setAlignment(Pos.CENTER);
        nappienAsettelu.setPadding(new Insets(0, 0, 15, 0));
        nappienAsettelu.setSpacing(10);
        nappienAsettelu.getChildren().addAll(nappi0.getKuva(), nappi1.getKuva(), nappi2.getKuva(), nappi3.getKuva());
        naytaIndeksi(napit,peli.getSeuraava());
        peliruudunAsettelu.setBottom(nappienAsettelu);

        Text text = new Text(10, 20, "Pisteet: " + peli.getOikeat());
        peliruudunAsettelu.setCenter(text);

//        AtomicInteger pisteet = new AtomicInteger();

//Map<KeyCode, Boolean> painetutNapit = new HashMap<>();
        peliNakyma.setOnKeyPressed(event -> {
//    painetutNapit.put(event.getCode(), Boolean.TRUE);
            if (event.getCode() == KeyCode.DIGIT1) {
                peli.tarkistaSeuraava(1);         
            }
            else if (event.getCode() == KeyCode.DIGIT2) {
                peli.tarkistaSeuraava(2);
            }
            else if (event.getCode() == KeyCode.DIGIT3) {
                peli.tarkistaSeuraava(3);
            }
            else if (event.getCode() == KeyCode.DIGIT4) {
                peli.tarkistaSeuraava(4);
            }
            if (peli.getSeuraava()==1){
                naytaIndeksi(napit, 0);
            }
            else if (peli.getSeuraava()==2) {
                naytaIndeksi(napit, 1);
            }
            else if (peli.getSeuraava()==3) {
                naytaIndeksi(napit, 2);
            }
            else if (peli.getSeuraava()==4) {
                naytaIndeksi(napit, 3);
            }
        });

        /*peliNakyma.setOnKeyReleased(event -> {
    painetutNapit.put(event.getCode(), Boolean.FALSE);
});*/


new AnimationTimer() {

    @Override
    public void handle(long nykyhetki) {
        /*if(painetutNapit.getOrDefault(KeyCode.LEFT, false)) {
            alus.setRotate(alus.getRotate() - 5);
        }

        if(painetutNapit.getOrDefault(KeyCode.RIGHT, false)) {
            alus.setRotate(alus.getRotate() + 5);
        }*/
        text.setText("Pisteet: " + peli.getOikeat());

    }
}.start();
        ikkuna.show();
    }
    
    public static void naytaIndeksi(ArrayList<Nappi> lista, int indeksi) {
        lista.forEach(nappi -> {
            if (lista.indexOf(nappi)==indeksi) {
                nappi.nakyvyys(true);
            } else {
                nappi.nakyvyys(false);
            }
        });
    
    }


    public static void main(String[] args) {
        
        launch(args);
    }

}
