package de.Tim.engeprüfteschleifezwei;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BottomTestedLoopTwo {

    private Scanner in;

    public BottomTestedLoopTwo() {
        in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        BottomTestedLoopTwo bottomTestedLoopTwo = new BottomTestedLoopTwo();
        //bottomTestedLoopTwo.problemOne();
        //bottomTestedLoopTwo.problemTwo();
        bottomTestedLoopTwo.problemThree();

    }

    public void problemOne() {
        int beginWorth = 25500;
        int endWorth = 2000;
        int numberOfYears = 0;
        do {
            beginWorth = beginWorth - (beginWorth * 25 / 100);
            numberOfYears = numberOfYears + 1;
        } while (beginWorth > endWorth);

        System.out.println("After " + numberOfYears + " years the car is only worth 2000€.");

    }

    public void problemTwo() {
        System.out.print("Type in how big the population of bacteria already is: ");
        int cultureBigness = in.nextInt();
        System.out.print("Type in the percentage with which the bacteria should grow: ");
        int percentalGrowth = in.nextInt();
        int days = 0;
        do {
            cultureBigness = cultureBigness * (percentalGrowth + 100) / 100;
            days = days + 1;
        } while (cultureBigness < cultureBigness * 2);
        System.out.println("The culture doubled its size after " + days + " days.");
    }

    public void problemThree() {
        int friendCounter = 4;
        int minutecounter = 2;

        do {
            friendCounter = friendCounter * friendCounter;
            minutecounter = minutecounter + 1;
        } while (friendCounter<30);
        System.out.println(minutecounter);
        int friendCounter1 = 4;
        int minutecounter1 = 2;

        do {
            friendCounter1 = friendCounter1 * friendCounter1;
            minutecounter1 = minutecounter1 + 1;
        } while (friendCounter1<1050);
        System.out.println(minutecounter1);
    }
}
