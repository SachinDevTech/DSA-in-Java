public class _03_ClassesPassByReference {

    // In this example, the Student class is defined outside this file.
    // If you define a class inside the main method, it will only be accessible within that method.
    // Classes are reference types in Java, meaning any changes made to an object inside a function
    // will reflect outside that function as well. This is known as passing by reference.

    public static void changeName(Student s) {
        // The 'changeName' method changes the name attribute of the Student object passed to it.
        s.name = "Gaurav Yadav"; // Changing the name to a new value.
    }

    public static void main(String[] args) {
        // Creating an instance (object) of the Student class.
        Student s1 = new Student();
        s1.name = "Sachin Kumar"; // Initial name assignment.
        System.out.println(s1.name); // Output: Sachin Kumar

        // Passing the 's1' object to the changeName method.
        changeName(s1); // The name will be changed inside this method due to pass-by-reference.

        // The original 's1' object's name is now changed.
        System.out.println(s1.name); // Output: Gaurav Yadav
    }
}