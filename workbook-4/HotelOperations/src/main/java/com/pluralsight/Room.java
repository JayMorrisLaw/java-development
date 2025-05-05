package com.pluralsight;

public class Room {
    private int NumberOfBeds;
    private double Price;
    private boolean Occupied;
    private boolean Dirty;
    private boolean Available;
// getters and setters
    public int getNumberOfBeds() {
        return NumberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        NumberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public boolean isOccupied() {
        return Occupied;
    }

    public void setOccupied(boolean occupied) {
        Occupied = occupied;
    }

    public boolean isDirty() {
        return Dirty;
    }

    public void setDirty(boolean dirty) {
        Dirty = dirty;
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean available) {
        Available = available;
    }
}
