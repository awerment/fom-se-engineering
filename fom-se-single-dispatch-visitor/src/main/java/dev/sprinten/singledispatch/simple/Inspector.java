package dev.sprinten.singledispatch.simple;

public interface Inspector {
    void inspect(Vehicle vehicle);
    void inspect(Car car);
    void inspect(Bike bike);
}
