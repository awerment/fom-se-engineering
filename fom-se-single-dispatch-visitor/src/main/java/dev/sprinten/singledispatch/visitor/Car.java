package dev.sprinten.singledispatch.visitor;

public class Car extends Vehicle {
    public Car(String model) {
        super(model);
    }

    @Override
    public void accept(Inspector inspector) {
        inspector.inspect(this);
    }
}
