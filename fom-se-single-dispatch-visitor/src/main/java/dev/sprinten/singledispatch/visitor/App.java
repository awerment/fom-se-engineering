package dev.sprinten.singledispatch.visitor;

public class App {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bike = new Bike("Yamaha");

        Inspector inspector = new RegistrationInspector();

        car.accept(inspector);
        bike.accept(inspector);
    }
}
