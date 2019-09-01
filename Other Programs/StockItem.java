package com.company;

public class StockItem {
    private  int code;
    private String name;
    private double price;
    private int quantity;

    StockItem(){

    }
    StockItem(int c, String n, double p, int q){
        this.code = c;
        this.name = n;
        this.price = p;
        this.quantity = q;

    }

    public void setCode(int cod) {
        this.code = cod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public  int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
    void getDetails(){
        System.out.println("");
        System.out.println("Code: " +getCode() );
        System.out.println("Name: " + getName() );
        System.out.println("Price: " +getPrice() );
        System.out.println("Quantity: " +getQuantity() );
    }

    public static void main(String[] args) {

        StockItem obj1 = new StockItem(1478, "Dell", 25000.0, 2);
        StockItem obj2 = new StockItem();
        obj2.setCode(130);
        obj2.setName("HP");
        obj2.setPrice(14000);
        obj2.setQuantity(5);

        obj1.getDetails();
        obj2.getDetails();
    }
}

