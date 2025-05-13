package com.pluralsight;

public class Asset {
    private String description;
    private String dateAcquired;
    private double OriginalCost;

    //constructor
    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        OriginalCost = originalCost;
    }
// getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {
        return OriginalCost;
    }

    public void setOriginalCost(double originalCost) {
        OriginalCost = originalCost;
    }

    public double getValue(){
        return OriginalCost;
    }

}
