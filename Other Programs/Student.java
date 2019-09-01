package com.company;

import java.util.Scanner;

public class Student {
    private String name;
    private String ERP;
    private int quizMarks[] = new int[3];
    Scanner inp = new Scanner(System.in);

    public Student(String n, String id, int a, int b, int c){
        this.name = n;
        this.ERP = id;
        this.quizMarks[0] =a;
        this.quizMarks[1] =b;
        this.quizMarks[2] =c;
    }
    void setName(String n){
        this.name = n;
    }
    void setERP(String a){
        this.ERP = a;
    }
    void setMarks(int a, int b, int c ){
        this.quizMarks[0] =a;
        this.quizMarks[1] =b;
        this.quizMarks[2] =c;
    }

    String getName(){
        return name;
    }
    String getERP(){
        return ERP;
    }
    void getMarks(){
        for ( int i =0; i < quizMarks.length; i++) {
            System.out.println(quizMarks[i]);
        }
    }

    public static void main(String[] args) {

    }
}
