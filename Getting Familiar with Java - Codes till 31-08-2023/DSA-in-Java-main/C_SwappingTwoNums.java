import java.util.Scanner;

public class C_SwappingTwoNums {
    // public static void SwappingCode(int a, int b) {
    // int temp = a;
    // a = b;
    // b = temp;
    // System.out.println("A is: " + a);
    // System.out.println("B is: " + b);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the values of a and b: ");
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // SwappingCode(a, b);
    // }

    // ----------------------------------------
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Before increment : " + number);
        increment(number);
        System.out.println("After increment: " + number);
    }

    public static void increment(int value) {
        value++; // Modifying the copy
        System.out.println("Inside the increment fxn: " + value);

    }
}
