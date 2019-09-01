package LabTasks;
import java.util.*;
public class Employee {
    private String Name;
    private String NIC;
    public String[][] arr;
    public Employee(String name, String CNIC){
 this.Name = name;
 this.NIC =CNIC;
    }
    public double Earnings(){
        return 0.0;
    }
    public void displayDetails(){
        System.out.println("Name: "+ Name);
        System.out.println("NIC: "+ NIC );

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter employee name");
        String name  = inp.nextLine();
        System.out.println("enter Employee CNIC");
        String cnic = inp.nextLine();
        Employee obj = new Employee(name,cnic);
        obj.displayDetails();
    }
}
