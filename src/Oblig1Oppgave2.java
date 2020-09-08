import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by Gauseeban on 21.07.2020.
 */
public class Oblig1Oppgave2 {
    public static void main(String[] args){

        String vare1Navn = showInputDialog("Skriv inn navnet på vare nr1");
        String innVare1Antall = showInputDialog("Skriv inn antall varer til vare nr 1");
        String innVare1Pris = showInputDialog("Skriv inn prisen på vare nr 1");

        String vare2Navn = showInputDialog("Skriv inn navnet på vare nr2");
        String innVare2Antall = showInputDialog("Skriv inn antall varer til vare nr 2");
        String innVare2Pris = showInputDialog("Skriv inn prisen på vare nr 2");

        int vare1Antall, vare2Antall;
        double vare1Pris, vare2Pris;

        try{
            vare1Antall = Integer.parseInt(innVare1Antall);
            vare1Pris = Double.parseDouble(innVare1Pris);
        } catch(Exception e) {
            vare1Antall=0;
            vare1Pris=0;
            showMessageDialog(null, "Feil i antall eller pris");
        }
        try {
            vare2Antall = Integer.parseInt(innVare2Antall);
            vare2Pris = Double.parseDouble(innVare2Pris);
        }
        catch (Exception e) {
            vare2Antall = 0;
            vare2Pris = 0;
            showMessageDialog(null, "Feil i antall eller pris");
        }

        Vare vare1 = new Vare(vare1Navn,vare1Antall,vare1Pris);
        Vare vare2 = new Vare(vare2Navn, vare2Antall, vare2Pris);

        double sum = vare1.beregnTotalPris()+vare2.beregnTotalPris();

        System.out.println("Totalprisen ble : " + sum + "kr");
    }
}
