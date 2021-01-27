package dev.sprinten.singledispatch.visitor;

public class Bike extends Vehicle {
    public Bike(String model) {
        super(model);
    }

    @Override
    public void accept(Inspector inspector) {
        inspector.inspect(this);
    }
}
