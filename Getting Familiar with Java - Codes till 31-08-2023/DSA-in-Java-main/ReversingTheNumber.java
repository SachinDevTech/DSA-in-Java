import java.util.Scanner;

public class ReversingTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Reverse: ");
        int number = sc.nextInt();
        // int number = 100;
        // while (number > 0) {
        // int lastDigit = number % 10;
        // System.out.print(lastDigit);
        // number = number / 10;
        // }
        for (; number > 0; ) {
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number = number / 10; 
        }
    }
}
