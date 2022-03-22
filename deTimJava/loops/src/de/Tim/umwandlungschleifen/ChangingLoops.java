package de.Tim.umwandlungschleifen;

import java.util.Scanner;

public class ChangingLoops {

    private Scanner in;

    public ChangingLoops() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        ChangingLoops changingLoops = new ChangingLoops();
        changingLoops.switchVariant();


    }

    public void switchVariant() {
        System.out.print("Type in number 1 for head tested loop variant or type in 2 for bottom tested loop variant: ");
        int input = in.nextInt();
        switch (input) {
            case 1 -> head();
            case 2 -> bottom();
            default -> System.out.println("No valid input");
        }
    }

    public void head() {
        

    }

    public void bottom() {

    }
}
