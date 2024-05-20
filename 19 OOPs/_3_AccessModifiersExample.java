// Public class accessible from anywhere
public class _3_AccessModifiersExample {

    // Public method accessible from anywhere
    public void publicMethod() {
        System.out.println("This is a public method");
    }

    // Protected method accessible within the same package or by subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    // Default method accessible within the same package
    void defaultMethod() {
        System.out.println("This is a default method");
    }

    // Private method accessible only within the same class
    private void privateMethod() {
        System.out.println("This is a private method");
    }

    // Main method to demonstrate access modifiers
    public static void main(String[] args) {
        _3_AccessModifiersExample example = new _3_AccessModifiersExample();

        // Accessing public method
        example.publicMethod();

        // Accessing protected method
        example.protectedMethod();

        // Accessing default method
        example.defaultMethod();

        // Accessing private method
        example.privateMethod(); // Error: privateMethod() has private access in AccessModifiersExample
    }
}
