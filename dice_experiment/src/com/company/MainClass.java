package com.company;
import java.util.*;

/**
 * musadiq hussain 12979
 * this has the main method and it calls other classes through the objects
 * scanner is taking value from the user in runtime
 *
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the number of rolls");
        int rolls = inp.nextInt();
        DiceExperiment obj = new DiceExperiment(rolls);
        obj.stimulation();
        for(int i=2; i<13;i++){
            System.out.print(i+": ");
            if(i<=9)
                System.out.print(" ");
            for(int j=0;j<obj.getArr()[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=2; i<=12;i++){
            System.out.println(i+": ");

            for(int j=0;j<obj.getresult()[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
