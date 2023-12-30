import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter the year to check Leap or Not ?\n");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        System.out.println("Specified year is a leap year");
        else
        System.out.println("Specified year is not a leap year");


        // Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if (a > b && a > c) {
        //     System.out.println("A");

        // } else if (b > a && b > c) {
        //     System.out.println("B");

        // } else {
        //     System.out.println("C");

        // }

    }
}