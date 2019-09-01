package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Point {
    private Double x_cor;
    private Double y_cor;
    public static int totalPoints;

    Scanner in = new Scanner(System.in);

    public Point(){
        totalPoints +=1;
    }

    public Point(Double x, Double y){
        this.x_cor = x;
        this.y_cor = y;
        totalPoints += 1;

    }
    public void setX(){
        System.out.println("Enter value of X; ");
        this.x_cor = in.nextDouble();
    }
    public void setY(){
        System.out.println("Enter value of Y; ");
        this.y_cor = in.nextDouble();
    }
    public void setPoint(){
        setX();
        setY();
    }

    public Double getX() {
        return x_cor;
    }

    public Double getY(){
        return y_cor;
    }

    public void getPoint(){
        System.out.println("(X,Y) = (" + getX() + "," + getY()+")");

    }



    public static void main(String[] args) {
	// write your code here
//
        Point p1 = new Point();
        Point p2 = new Point();
        p1.setX();
        p1.setY();
        System.out.println("P1:");
        p1.getPoint();
        System.out.println("P2");
        p2.setPoint();
        System.out.printf("P2 with setPoint");
        p2.getPoint();
        System.out.println("P3 with 2 arguments constructor ");
        Point p3 = new Point(10.0,20.0);
        p3.getPoint();

        ArrayList<Point> Points = new ArrayList<Point>();
        Points.add( new Point(1.0, 4.0));
        Points.add( new Point(8.0, 9.0));
        Points.add( new Point(6.0, 8.0));
        Points.add( new Point());
        Points.get(3).setPoint();
        Points.add( new Point());
        Points.get(4).setPoint();


        for (int i=0; i<5; i++){
             Points.get(i).getPoint();
        }
        System.out.println("array is initiallized: ");
        Point[] mypoints = new Point[2];
        mypoints[0] = new Point(40.0, 50.0);
        mypoints[1] = new Point();
        mypoints[1].setPoint();

        System.out.println("displaying values of array: ");

        for (int i=0; i< mypoints.length; i++){
            mypoints[i].getPoint();
        }


    }
}
