package com.touchizen.drawerwithbottomnavigation.parking;

public class ParkingModelClass {
    String vehicle1;
    String vehicle2;

    public String getVehicle1() {
        return vehicle1;
    }

    public void setVehicle1(String vehicle1) {
        this.vehicle1 = vehicle1;
    }

    public String getVehicle2() {
        return vehicle2;
    }

    public void setVehicle2(String vehicle2) {
        this.vehicle2 = vehicle2;
    }

    public ParkingModelClass(String vehicle1, String vehicle2) {
        this.vehicle1 = vehicle1;
        this.vehicle2 = vehicle2;
    }

    public ParkingModelClass() {
    }
}
