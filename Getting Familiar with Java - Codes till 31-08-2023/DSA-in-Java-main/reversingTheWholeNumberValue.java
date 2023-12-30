import java.util.Scanner;

public class reversingTheWholeNumberValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number you want to reverse: ");

        int n = scanner.nextInt();
        int reverse = 0;
        for (; n > 0; ) {
            int ld = n % 10;
            reverse = (reverse * 10) + ld;
            n /= 10;
        }
        // reverse = reverse + 1;
        System.out.println("The reverse of the input number is: " + reverse);
    }
}
