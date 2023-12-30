
//Finding binomial coefficient
import java.util.*;

public class practice_1 {
    public static int calcFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int calcBinomialCoeffi(int n, int r) {
        return calcFactorial(n) / (calcFactorial(r) * calcFactorial(n - r));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println("Enter the value of r: ");
        int r = input.nextInt();
        System.out.println("The value of nCr is: " + calcBinomialCoeffi(n, r));
    }
}
