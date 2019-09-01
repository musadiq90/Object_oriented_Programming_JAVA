package LabTasks;

public class HourlyEmployee extends Employee {
    private double Wage;
    private double Hours;

    public HourlyEmployee(String n, String ID, double wage, double hours) {
        super(n, ID);
        Wage = wage;
        Hours = hours;
    }
    public double Earnings(){
        return 0.0;
    }
    public void displayDetails(){

    }
}
