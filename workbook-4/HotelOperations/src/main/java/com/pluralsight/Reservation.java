package com.pluralsight;

public class Reservation {
    private String RoomType;
    private double Price;
    private int NumberOfNights;
    private boolean Weekend;
    private double ReservationTotal;
// getters and setters
    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getNumberOfNights() {
        return NumberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        NumberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return Weekend;
    }

    public void setWeekend(boolean weekend) {
        Weekend = weekend;
    }

    public double getReservationTotal() {
        return ReservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {
        ReservationTotal = reservationTotal;
    }
}
