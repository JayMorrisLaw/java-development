package com.pluralsight;

public class Employee {
    private int EmployeeID;
    private String Name;
    private String Department;
    private double PayRate;
    private double HoursWorked;
// getters and setters
    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public double getPayRate() {
        return PayRate;
    }

    public void setPayRate(double payRate) {
        PayRate = payRate;
    }

    public double getHoursWorked() {
        return HoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        HoursWorked = hoursWorked;
    }
    // calculated getters
    public double getTotalPay(){
        return PayRate * HoursWorked;
    }
    public double getRegularHours(){
        if (HoursWorked )
    }
}
