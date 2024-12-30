// Interface Movable
interface Movable {
     void move();
     default void moving(){
             System.out.println("vehicle is Moving...");
     }
}

// Abstract class Vehicle with a method start()
abstract class Vehicle {
    abstract void start();
}

// Car class extends Vehicle
class Car extends Vehicle implements Movable {
    @Override
    void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void move() {
        System.out.println("Car is moving...");
    }
}

// Bicycle class implements both Movable and Vehicle
class Bicycle extends Vehicle implements Movable {
    @Override
    void start() {
        System.out.println("Bicycle is ready to go...");
    }

    @Override
    public void move() {
        System.out.println("Bicycle is moving...");
    }
}

public class VehicleMoveStart {
    public static void main(String[] args) {
        // Create objects
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        // Use the start method
        car.start();
        bicycle.start();

        // Use the move method
        ((Movable) car).move();  // Typecasting to Movable to call move()
        ((Movable) bicycle).move();  // Typecasting to Movable to call move()
    }
}
