package dev.sprinten.singledispatch.simple;

public class App {

    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bike = new Bike("Yamaha");

        Inspector inspector = new RegistrationInspector();

        inspector.inspect(car);
        inspector.inspect(bike);

        Car car2 = new Car("Toyota");
        inspector.inspect(car2);
    }

}
