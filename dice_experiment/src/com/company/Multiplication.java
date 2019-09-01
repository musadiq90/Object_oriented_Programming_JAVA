package com.company;

/**
 * class name multiplication, with 3 instance variable.
 *
 *
 */
public class Multiplication {
    int first;
    int last;
    int prod = 1;

    /**
     *  constructor parametrized with 2 parameters
     * @param a
     * @param b
     */
    public Multiplication(int a, int b) {
        this.first = a;
        this.last = b;
    }

    /**
     * product() has a for loop that mutiply all the values
     * @return prod
     */
    int Product(){
        for (int i=first; i<=last; i++){
        prod = prod *i;
        }
        return prod;
    }
}
