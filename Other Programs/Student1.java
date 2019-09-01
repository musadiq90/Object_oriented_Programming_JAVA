package com.company;

import java.util.Scanner;
public class Student1{
    private String name;
    private int[] quizMarks=new int[3];
    private static int totalMarks;
    public Student1(){

        totalMarks=0;}
    public Student1(String Name, int r1, int r2, int r3){
        this.name=Name;
        this.quizMarks[0]=r1;
        this.quizMarks[1]=r2;
        this.quizMarks[2]=r3;

    }
    public void setName(String Name){
        this.name=Name;
    }
    public String getName(){
        return this.name;}
    public void setMarks(int a, int b, int c){
        this.quizMarks[0]=a;
        this.quizMarks[1]=b;
        this.quizMarks[2]=c;

    }
    public int getTotalMarks(){
        totalMarks = 0;
         totalMarks =  this.quizMarks[0] + this.quizMarks[1]+ this.quizMarks[2];
        return totalMarks;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student1 s1=new Student1("A", 10, 9, 8);
        Student1 s2=new Student1("B", 8, 10, 10);
        Student1 s3=new Student1();
        System.out.println("Enter the name of third student");
        s3.setName(sc.next());
        System.out.println("Enter the quiz marks of third student, separated by space");
        s3.setMarks(sc.nextInt(), sc.nextInt(), sc.nextInt());
        int a=s1.getTotalMarks();
        int b=s2.getTotalMarks();
        int c=s3.getTotalMarks();
        int max=Math.max(a, Math.max(c,b));
        if(a==b && a== c){
            System.out.println("Highest marks are secured by "+s1.getName()+", "+s2.getName()+" & "+s3.getName());}
        else if (a==b){
            System.out.println("Highest marks are secured by "+s1.getName()+" & "+s2.getName());}
        else if (a==c){
            System.out.println("Highest marks are secured by "+s1.getName()+" & "+s3.getName());}
        else if (b==c){
            System.out.println("Highest marks are secured by "+s2.getName()+" & "+s3.getName());}
        else if(max==a){
            System.out.println("Highest marks are secured by "+s1.getName());}
        else if(max==b){
            System.out.println("Highest marks are secured by "+s2.getName());}
        else if(max==c){
            System.out.println("Highest marks are secured by "+s3.getName());}

    }
}