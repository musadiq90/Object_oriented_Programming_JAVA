package com.company;
import java.util.Scanner;

/**
 * first of all i imported the Scanner utility, for getting input from the user while in runtime
 * my class name is @Summation.java. then i declared three public static variables. simple variable wasn't linking
 * from a static method. initially i faced some problem, but after declaring it static my problem solved.
 *
 */
public class Summation {
    public static int First;
    public static int Last;
    public int totalSum;

    public Summation(int First, int Last) {
        this.First = First;
        this.Last = Last;
    }

    /**
     * declared a parametrized Sum() method of return type int, which takes two int variables as parameters.
     * and for loop start from the value of int first till last int value. adding all the values
     * and store it in memory location at total(). and will return totalm().
     * @return total
     */

    public int Total() {
        for (int i = First;i<=Last; i++){
            totalSum = totalSum +i;
        }
        return totalSum;
    }

    /**
     * scanner is calling for the two values to enter and store it in first and last variables.
     * an object is created to call the sum(..._) methed
     * @param args
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        First = inp.nextInt();
        Last = inp.nextInt();
        Summation obj = new Summation(First, Last);
        System.out.println(obj.Total());
    }
}
