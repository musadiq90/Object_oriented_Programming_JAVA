package com.company;
import java.util.*;
/**
 *musadiq hussain
 * it is the class of main method.
 * 2 instance variable are declared
 */
public class Table {

     static int n;
     static int size;

    /**
     * scanner takes an integer value from the user
     * also an object is also created, which call the method of toString()
     * also print it here
     * @param args
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter any integer");
        n = inp.nextInt(); // an integer
        size = inp.nextInt();

        ModulusTable obj = new ModulusTable(n,size);
        System.out.println(obj.toString());
    }
}
