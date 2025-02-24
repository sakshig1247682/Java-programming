// TCS Technical Coding Interview Question (OOPs Concept - Method Overriding & Interfaces)
// Question:
// Design a Vehicle Management System using OOPs principles in Java. The system should support the following functionalities:

// Abstraction & Interface:
// Create an interface Vehicle with methods start(), stop(), and displayInfo().
// Encapsulation & Inheritance:
// Create classes Car and Bike that implement Vehicle.
// Each class should have properties like brand, model, and fuelType.
// Polymorphism (Method Overriding):
// Override the start() and stop() methods in Car and Bike.
// Demonstration:
// Create objects of Car and Bike, call start(), stop(), and displayInfo() methods.

// Abstraction: Interface Vehicle with common methods
interface Vehicle {
    void start();
    void stop();
    void displayInfo();
}

// Encapsulation & Inheritance: Car implements Vehicle
class Car implements Vehicle {
    private String brand;
    private String model;
    private String fuelType;

    // Constructor
    public Car(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }

    // Overriding start method
    @Override
    public void start() {
        System.out.println(brand + " " + model + " (Car) is starting...");
    }

    // Overriding stop method
    @Override
    public void stop() {
        System.out.println(brand + " " + model + " (Car) is stopping...");
    }

    // Display car details
    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + brand + ", Model: " + model + ", Fuel Type: " + fuelType);
    }
}

// Inheritance: Bike implements Vehicle
class Bike implements Vehicle {
    private String brand;
    private String model;
    private String fuelType;

    // Constructor
    public Bike(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }

    // Overriding start method
    @Override
    public void start() {
        System.out.println(brand + " " + model + " (Bike) is starting...");
    }

    // Overriding stop method
    @Override
    public void stop() {
        System.out.println(brand + " " + model + " (Bike) is stopping...");
    }

    // Display bike details
    @Override
    public void displayInfo() {
        System.out.println("Bike Brand: " + brand + ", Model: " + model + ", Fuel Type: " + fuelType);
    }
}

// Main class for testing
public class Main {
    public static void main(String[] args) {
        // Creating objects of Car and Bike
        Vehicle myCar = new Car("Toyota", "Camry", "Petrol");
        Vehicle myBike = new Bike("Yamaha", "R15", "Petrol");

        // Testing Car functionality
        myCar.displayInfo();
        myCar.start();
        myCar.stop();

        System.out.println();

        // Testing Bike functionality
        myBike.displayInfo();
        myBike.start();
        myBike.stop();
    }
}

