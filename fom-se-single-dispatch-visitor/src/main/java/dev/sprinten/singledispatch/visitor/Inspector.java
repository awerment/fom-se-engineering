package dev.sprinten.singledispatch.visitor;

public interface Inspector {
    void inspect(Vehicle vehicle);
    void inspect(Car car);
    void inspect(Bike bike);
}
