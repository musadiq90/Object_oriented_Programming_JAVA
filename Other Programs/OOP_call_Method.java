package com.company;

public class Main {
    Main(){
        System.out.println("Object created");
    }


    public static void main(String[] args) {
	// write your code here

        System.out.println("before object call");
        Main obj = new Main();
        System.out.println("after Object call");

    }
}
