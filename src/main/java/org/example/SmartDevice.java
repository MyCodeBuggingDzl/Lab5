package org.example;

public abstract class SmartDevice  {
    private final String brand;
    private final String model;


    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public abstract void performMainAction();

    public void showBasicInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
    }
}