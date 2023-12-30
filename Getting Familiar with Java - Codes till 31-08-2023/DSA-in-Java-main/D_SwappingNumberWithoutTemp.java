import java.util.Scanner;

public class D_SwappingNumberWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of num2: ");

        int num2 = sc.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Num1 is: " + num1 + " and " + "Num2 is: " + num2);
    }
}