package com.pluralsight;
// cellphone class step 1, create a constructor and make a cellphone
public class CellPhone {
    private int serialNumber;
    private String phoneModel;
    private String carrier;
    private String phoneNumber;
    private String owner;


    // 2 set phone attributes,     each attribute gets a setter and a getter
    public CellPhone() {
        this.serialNumber = 0;
        this.phoneModel = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
// 3 create getters and setters using right click generate select all ,  getter retrieves info setter updates info, these will run in the main class
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNUmber) {
        this.phoneNumber = phoneNUmber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

