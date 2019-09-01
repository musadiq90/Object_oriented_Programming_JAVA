package LabTasks;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String n, String ID, double weeklySalary) {
        super(n, ID);
        this.weeklySalary = weeklySalary;
    }
    public double Earnings(){
        return 0.0;
    }
    public void displayDetails(){

    }


}
