package dev.sprinten.singledispatch.visitor;

public abstract class Vehicle {
    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract void accept(Inspector inspector);
}
