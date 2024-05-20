public class Constructor_Ex2 {
    public static void main(String[] args) {
        // Make calls from here
        Student s1 = new Student();
        System.out.println();
        Student s2 = new Student();
        System.out.println();
        System.out.println(s1.age);
        System.out.println(s2.age);
    }
}

class Student {
    String name;
    int rollNo, age;

    // non-parameterized constructor
    Student() { //same name as class name
        this.name = "S Kumar";
        this.rollNo = 47;
        this.age = 21;
    }

    // parameterized constructor
    Student(String name, int rollN, int agee) { // we also can define parameter in it as well
        this.name = name;
        this.rollNo = rollN;
        this.age = agee;
    }
    Student(String name) {
        this.name = name;
        
    }
}