package com.pluralsight;

public class Vehicle {
    private long vehicle;
    private String makeModel;
    private String color;
    private int odometer;
    private float price;
// constructor


    public Vehicle(long vehicle, String makeModel, String color, int odometer, float price) {
        this.vehicle = vehicle;
        this.makeModel = makeModel;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public long getVehicle() {
        return vehicle;
    }

    public void setVehicle(long vehicle) {
        this.vehicle = vehicle;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    // using the  Tostring method , right click generate
    // tostring method overrides the default behavior of java, it shows the attributes of the object
    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicle=" + vehicle +
                ", makeModel='" + makeModel + '\'' +
                ", color='" + color + '\'' +
                ", odometer=" + odometer +
                ", price=" + price +
                '}';
    }
}
