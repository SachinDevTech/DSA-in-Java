public class _1_ObjectsN_Classes {
    public static void main(String[] args) {
        // Creating objects (instances) of the 'Car' class
        Car car1 = new Car("Toyota", "Corolla", 2022);
        Car car2 = new Car("BMW", "X5", 2020);

        // Accessing object methods and attributes
        car1.displayInfo(); // Output: Car: 2022 Toyota Corolla
        car2.displayInfo(); // Output: Car: 2020 BMW X5
    }
}

// Defining a class called 'Car'
class Car {
    // Attributes or fields
    String make;
    String model;
    int year;

    // Constructor to initialize the object
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}