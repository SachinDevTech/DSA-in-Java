// Person class representing an individual
class Person {
    // Private fields to encapsulate personal attributes
    private String name;
    private int age;
    private String address;

    // Constructor to initialize a person object with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name (public)
    public String getName() {
        return name;
    }

    // Setter method for name (public)
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age (public)
    public int getAge() {
        return age;
    }

    // Setter method for age (public)
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for address (public)
    public String getAddress() {
        return address;
    }

    // Setter method for address (public)
    public void setAddress(String address) {
        this.address = address;
    }
}

// Main class to demonstrate encapsulation
public class _5_EncapsulationExample {
    public static void main(String[] args) {
        // Creating a new person object
        Person person = new Person("Alice", 30);

        // Accessing and updating attributes using getter and setter methods
        System.out.println("Initial name: " + person.getName());
        person.setName("Bob");
        System.out.println("Updated name: " + person.getName());

        System.out.println("Initial age: " + person.getAge());
        person.setAge(35);
        System.out.println("Updated age: " + person.getAge());

        // Trying to access address directly (will cause error due to encapsulation)
        // System.out.println("Address: " + person.address); // Error: field address has private access in Person

        // Setting address using setter method
        person.setAddress("123 Main St");
        System.out.println("Address: " + person.getAddress());
    }
}
