package com.company;

public class Rectangl {
    private double length;
    private  double width;
    public  Rectangl(){

    }
    public  Rectangl(double l, double w) {
        this.length = l;
        this.width = w;
    }
    public void setDimension(double l, double w){
        this.length = l;
        this.width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return  2*(length+width);
    }
    @Override
    public String toString() {
        return ("Length=  " + length + "; width= " + width
                + "\n  Area= " + area());
    }
}
