package com.company;

class Practice01 {
    int a;
    int b;

    public void setData(int a ,int b){
        this.a = a;
        this.b = b;
    }
    public void showData(){
        System.out.println("Value of A ="+a);
        System.out.println("Value of B ="+b);
    }
    public void ShowData(int c, int d){
        System.out.println(a);
        System.out.println(" instance variable: "+ this.a);
    }
    public static void main(String args[]){
        Practice01 obj = new Practice01();
        obj.setData(2,3);
        obj.showData();
        obj.ShowData(10,20);
    }
}
