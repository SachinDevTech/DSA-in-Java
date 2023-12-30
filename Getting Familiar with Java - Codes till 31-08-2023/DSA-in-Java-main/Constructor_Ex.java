public class Constructor_Ex {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("\n\n" + s1.name + " " + s1.rollNo + " " + s1.age + "\n");

        // can pass arguments here as well like as: Student("Sachin Kumar" , 47, 21)

        Student s2 = new Student("\nSachin Kumar", 47, 21);
        System.out.println(s2.name + " " + s2.rollNo + " " + s2.age + "\n");
    }
}

class Student {
    String name;
    int rollNo, age;

    Student() {
        this.name = "S Kumar";
        this.rollNo = 47;
        this.age = 21;
    }

    Student(String name, int rollN, int agee) { // we also can define parameter in it as well
        this.name = name;
        this.rollNo = rollN;
        this.age = agee;
    }
}