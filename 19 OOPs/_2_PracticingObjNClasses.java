public class _2_PracticingObjNClasses {
    public static void main(String[] args) {
        Person p1 = new Person("SK", 12);
        p1.setAge(21);
        p1.setName("Sachin Kumar");
        System.out.println("Name is: "+p1.getName());
        System.out.println("Age is: " + p1.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
