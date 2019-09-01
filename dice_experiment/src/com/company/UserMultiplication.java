package com.company;
import java.util.*;

/**
 * musadiq hussain 12979
 * class name UserMultiplication with 2 static variables
 * scanner takes 2 it values from user and then object is created for calling the product method.
 *
 */
public class UserMultiplication {
     static int a;
     static int b;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter two integers");
         a = inp.nextInt();
         b = inp.nextInt();
        Multiplication obj = new Multiplication( a, b);
        System.out.println("the product from "+a+" to "+b+" is: "+obj.Product());
    }
}