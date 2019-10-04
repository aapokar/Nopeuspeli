package nopeuspeli;

import java.util.ArrayList;
import java.util.Random;

public class Peli {

    private int oikeat;
    private ArrayList<Integer> arvotut;
    private Random rnd;
    String polku;

    public Peli() {
        this.rnd = new Random();
        this.oikeat = 0;
        this.arvotut = new ArrayList<Integer>();
        this.arvotut.add(rnd.nextInt(4) + 1);
        this.polku = this.getClass().getResource("/kuvat/punnappi.png").getPath();
        System.out.println(this.polku);
    }

    public int getSeuraava() {
        return this.arvotut.get(oikeat);
    }

    public void arvoSeuraava() {
        int edellinen = this.arvotut.get(oikeat - 1);
        int uusi = rnd.nextInt(4) + 1;
        while (uusi == edellinen) {
            uusi = rnd.nextInt(4) + 1;
        }

        this.arvotut.add(uusi);
    }

    public void tarkistaSeuraava(int luku) {
        if (luku == arvotut.get(oikeat)) {
            oikeat++;
            this.arvoSeuraava();

        }
    }

    public int getOikeat() {
        return oikeat;
    }

}
