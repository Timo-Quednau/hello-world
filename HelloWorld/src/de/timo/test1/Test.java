package de.timo.test1;
import javax.swing.JOptionPane;
import java.lang.reflect.*;
public class Test {
    public static void main(String[] args) {
        auswahl();
    }
    static void exit (){}
    static  void auswahl() {
        String test1 = "";
        int liste = 0;
        for (Method method : Test.class.getDeclaredMethods()) {
            String name = method.getName();
            if (name == "main") {}
            else if (name == "auswahl") {}
            else {
                test1 = test1 + liste+ ":" + name + ", ";
                liste++;}
        }
        Integer ausgewählt = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(test1));
        if (ausgewählt == 0) {exit();}
        else if (ausgewählt == 0) { variablen(); }
        else if (ausgewählt == 2) { quadrieren(); }
        else if (ausgewählt == 3) { gewinnspiel(); }
        else if (ausgewählt == 4) { files(); }
        else if (ausgewählt == 5) { liter(); }
        else if (ausgewählt == 6) { ungerade(); }
        else if (ausgewählt == 7) { sterne(5); }
        else if (ausgewählt == 8) { random(); }
        else if (ausgewählt == 9) { pyramide(); }

        else {exit();}
    }

    static void quadrieren(){
        int v9 = 1 + 2;
        System.out.println(v9);
        String s = javax.swing.JOptionPane.showInputDialog( "Bitte Zahl eingeben" );
        int x = Integer.parseInt(s);
        System.out.println(x * x);
        auswahl();}
    static void gewinnspiel () {
        double d = 1.59;
        System.out.println( (int) (d / 2) + " x 2 €" );
        d %= 2;
        System.out.println( (int) (d / 1) + " x 1 €" );
        d %= 1;
        System.out.println( (int) (d / 0.5) + " x 50 Cent" );
        d %= 0.5;
        System.out.println( (int) (d / 0.2) + " x 20 Cent" );
        d %= 0.2;
        System.out.println( (int) (d / 0.1) + " x 10 Cent" );
        d %= 0.1;
        System.out.println( (int) (d / 0.05) + " x 5 Cent" );
        d %= 0.05;
        System.out.println( (int) (d / 0.02) + " x 2 Cent" );
        d %= 0.02;
        System.out.println( (int) (d / 0.01) + " x 1 Cent" );
        System.out.println();
        auswahl();}
    static void files () {
        int noOfFiles = 2;  // oder 0, 1, 99, ...
        System.out.printf( "Es gibt %s Datei%s.", noOfFiles,
                noOfFiles != 1 ? "en" : "" );
        System.out.println();
        auswahl();}
    static void liter () {
        double value = Double.parseDouble(javax.swing.JOptionPane.showInputDialog( "Bitte Menge in Liter angeben(mit'.')"));
        if ( value >= 1 ) { System.out.printf( "ca. %d l", (int) value ); }
        else if ( value >= 0.1 ) { System.out.printf( "ca. %d cl", (int) (value * 10) ); }
        else if ( value >= 0.001 ) { System.out.printf( "ca. %d ml", (int) (value * 1000) ); }
        else { System.err.println( "Wert zu klein zur Darstellung" ); }
        System.out.println();
        auswahl();}
    static void ungerade () {
        Integer geradeodernicht = Integer.parseInt(javax.swing.JOptionPane.showInputDialog( "Geben sie eine Zahl ein"));
        if ( geradeodernicht%2 == 0 ) { System.out.println("Gerade") ; }
        else if ( geradeodernicht%2 == 1 ) { System.out.println("Ungerade") ; }
        auswahl();}
    static void sterne (int x2) {
        while (x2 < 30) { x2++; System.out.print("*");  }
        System.out.println();
        auswahl();}
    static void random () {
        double t = Math.random() * 10;
        while (t > 0) {
            if (t<1) { t=t*2;}
            else if (t>=1) {t--;}
            System.out.println(t); }
        System.out.println();
        auswahl();}
    static void pyramide () {
        int x3 = 1;
        int x5 = 5;
        while (x3<=5) {
            for (int x6 = x5; x6 > 1; x6--) {
                System.out.print(" ");
            }
            int x4 = x3;
            while (x4 > 0) {
                System.out.print(x3 + " ");
                x4--; }
            x3++; x5--; System.out.println();}
        auswahl();}
}
