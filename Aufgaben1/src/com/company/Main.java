package com.company;

import java.util.Scanner;

public class Main {

    private Scanner in;
    public Main(){
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
	    Main main = new Main();
        main.quarderberechnung();
        main.wochenlohn();
        main.kreisring();
        main.kegelberechnung();
        main.maklerfirma();
        main.weinhaendler();
    }

        public void quarderberechnung(){
        System.out.print("Kantenlaenge1 eingeben: ");
        int kantenlaenge1 = in.nextInt();
        System.out.print("Kantenlaenge2 eingeben: ");
        int kantenlaenge2 = in.nextInt();
        System.out.print("Kantenlaenge3 eingeben: ");
        int kantenlaenge3 = in.nextInt();

        int oberflaeche = 2*(kantenlaenge1*kantenlaenge2+kantenlaenge1*kantenlaenge3+kantenlaenge2*kantenlaenge3);
        int volumen = kantenlaenge1*kantenlaenge2*kantenlaenge3;

        System.out.println("Die Oberflaeche ist: "+oberflaeche);
        System.out.println("Das Volumen betraegt: "+volumen);

    }
    public void wochenlohn(){
        System.out.print("Geben sie den Stundenlohn ein: ");
        int stundenlohn = in.nextInt();
        System.out.print("Geben sie die Arbeitsstunden ein: ");
        int arbeitsstunden = in.nextInt();
        System.out.print("Geben sie den Überstunden ein: ");
        int ueberstunden = in.nextInt();

        int gesamtlohn = (arbeitsstunden*stundenlohn)+(ueberstunden*(stundenlohn*120/100));

        System.out.println("Ihr Gehalt beträgt: "+gesamtlohn);
    }
    public void kreisring(){
        System.out.print("Geben sie den Innenradius ein: ");
        double innenradius = in.nextDouble();
        System.out.print("Geben sie den Aussenradius ein: ");
        double aussenradius = in.nextDouble();

        double flaecheninhalt = Math.PI * (aussenradius*aussenradius-innenradius*innenradius);

        System.out.println("Der Flächeninhalt beträgt: "+flaecheninhalt);
    }
    public void kegelberechnung(){
        System.out.print("Geben sie den Radius r ein: ");
        double radius = in.nextDouble();
        System.out.print("Geben sie die Höhe h ein: ");
        double hoehe = in.nextDouble();

        double seitenlinie = Math.sqrt(hoehe*hoehe+radius*radius);
        double oberflaeche = Math.PI*radius*(radius+seitenlinie);
        double volumen = Math.PI/3*radius*radius*hoehe;

        System.out.println("Die Länge der Seitenlinie beträgt: "+seitenlinie);
        System.out.println("Die Oberflaeche beträgt: "+oberflaeche);
        System.out.println("Das Volumen beträgt: "+volumen);

    }

    public void weinhaendler(){
        System.out.print("Geben sie die zu bezahlende Flaschenanzahl ein: ");
        int flaschenanzahl = in.nextInt();
        double flaschenpreis = 5.00;
        double endbetrag;

        if (flaschenanzahl>=100){
            endbetrag = flaschenanzahl*4.50;
        } else{
            endbetrag = flaschenanzahl * flaschenpreis;
        }
        System.out.println("Der zu zahlende Endbetrag ist: "+endbetrag+"€");
    }
}
