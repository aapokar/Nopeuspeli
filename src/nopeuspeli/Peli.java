
package nopeuspeli;


import java.util.ArrayList;
import java.util.Random;

public class Peli {
    private int oikeat;
    private ArrayList arvotut;
    private Random rnd;
    
    
    public Peli() {
        this.rnd = new Random();
        this.oikeat=0;
        this.arvotut= new ArrayList();
        for (int i = 0; i<4; i++) {
            this.arvotut.add(rnd.nextInt(4)+1);
        }
        
    }
}
