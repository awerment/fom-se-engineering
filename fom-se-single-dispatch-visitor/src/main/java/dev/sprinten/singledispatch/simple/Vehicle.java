package dev.sprinten.singledispatch.simple;

public abstract class Vehicle {
    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
