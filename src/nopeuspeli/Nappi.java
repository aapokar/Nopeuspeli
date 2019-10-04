package nopeuspeli;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Nappi {

    private Image image;
    private ImageView kuva;
            
    public Nappi(String osoite) {
        this.image = new Image(osoite);
        this.kuva = new ImageView(this.image);
    }

    public ImageView getKuva() {
        return kuva;
    }
    
    public void nakyvyys(boolean arvo) {
        if (arvo) {
            this.kuva.setOpacity(1);
        } else {
            this.kuva.setOpacity(0.25);
        }
    }
}
