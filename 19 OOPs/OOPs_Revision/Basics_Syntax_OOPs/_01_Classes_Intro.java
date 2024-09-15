public class _01_Classes_Intro{

    // this is a new class made having similar properties for diff diff students (in simple words we are creating a new custom datatype.)
    public static  class Student{
        String name;
        int rollNo;
        float percent;
    }


    public static void main(String[] args) {
        // Creating an object of a class Student as s1
        Student s1 = new Student();
        s1.name = "Gaurav Yadav";
        s1.rollNo = 7609;
        s1.percent = 82.4f;

        // Creating an object of a class Student as s2
        Student s2 = new Student();
        s1.name = "Mukund Shukla";
        s1.rollNo = 7601;
        s1.percent = 91.2f;


        // System.out.println(s1.name+" "+ "whose roll number is: "+ s1.rollNo + " and whose percent is: " + s1.percent+"%");
    }
}