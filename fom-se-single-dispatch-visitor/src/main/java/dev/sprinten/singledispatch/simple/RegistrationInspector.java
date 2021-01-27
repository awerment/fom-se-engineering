package dev.sprinten.singledispatch.simple;

public class RegistrationInspector implements Inspector {
    @Override
    public void inspect(Vehicle vehicle) {
        System.out.println("Inspecting unknown vehicle of model " + vehicle.getModel());
    }
    @Override
    public void inspect(Car car) {
        System.out.println("Inspecting car of model " + car.getModel());
    }
    @Override
    public void inspect(Bike bike) {
        System.out.println("Inspecting bike of model " + bike.getModel());
    }
}
