import java.util.*;

public class primesInRange {
    public static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int num = input.nextInt();
        System.out.println("isPrime: " + isPrime(num));
        primesInRange(num);

    }
}
