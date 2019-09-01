package LabTasks;
import java.util.*;
public class Student {
    private static String name;
    private static int testScore;
    private static String grade;
    Scanner inp = new Scanner(System.in);
    static String[][] names = new String[5][2];

    public Student(){

    }
    public void getName() {
        int i;
        int j = 0;
        for (i = 0; i < 5; i++) {
            //String studentName = inp.next();
            //arr[i][] = studentName;
            for (j = 0; j < 1; j++) {
                names[i][j] = inp.next();
                System.out.println("enter name and score of next student");
            }

        }
    }

    public void setTestScore(){

   for (int i=0; i<5; i++){
       for(int j=1; j<2; j++){
           names[i][j] = String.valueOf(inp.nextInt());
       }
       System.out.println();
   }
    }
    public void getGrade(){
        for (int i=0; i<5; i++ ){
            for (int j=0; j<2; j++){
                System.out.print(names[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public void computeGrade(){
        for (int i=0; i<5; i++) {
            for (int j = 1; j < 2; j++) {
                if (((Integer.parseInt(names[i][j])) > 70) && ((Integer.parseInt(names[i][j])) <100)){
                    System.out.println(names[i][j-1]+ " is Pass");
                }
                else if(((Integer.parseInt(names[i][j])) < 70)){
                    System.out.println(names[i][j-1]+" is Fail");
                }
                else {
                    System.out.println("error: score isn't in the range");
                }
            }
            }
    }

    public static void main(String[] args) {
     //create an array of 5 students [name][score]
        /**
         *
        System.out.println("enter the name of 1st student with their score");
        for (int i=0; i<5;i++){
            for (int j=0; j<=1; j++){
                System.out.print(names[i][j]+ "  ");
                // sum = Integer.parseInt(sum + arr[i][j+1]);
            }
           // System.out.println(" = sum: "+ sum);
            System.out.println();
         */

        Student obj = new Student();
        System.out.println("enter the names");
        obj.getName();
        System.out.println("enter the score");
        obj.setTestScore();
        System.out.println("wait...... for the table");
        obj.getGrade();
        System.out.println("wait...... your grade is computing");
        obj.computeGrade();

        Student obj1 = new UndergraduateStudent();
        //obj1.computeGrade();
        Student obj2 = new GraduateStudent();
        obj2.computeGrade();

        }

        }


