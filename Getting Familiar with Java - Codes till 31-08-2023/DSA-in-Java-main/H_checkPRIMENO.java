import java.util.Scanner;

public class H_checkPRIMENO {
    // -----------Good Method----------------
    // public static boolean CheckPrime(int num) {
    // boolean isPrime = true;
    // for (int i = 2; i < num ; i++) {

    // if (num % i == 0) {
    // isPrime = false;
    // break;
    // }
    // }
    // return isPrime;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Check no. for Prime: ");
    // int n = sc.nextInt();
    // System.out.println(CheckPrime(n));
    // }

    // ---------------------------Best Method--------------
    public static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number to check whether it's prime or not :");
        int num = scanner.nextInt();
        System.out.println("isPrime: " + isPrime(num));

        // This line is to calculate primesIn Range
        PrimesInRange(num);
    }

    // Finding primes in range using upper function
    public static void PrimesInRange(int num) { // to print PrimesInRange
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) { // if true then go ahead
                System.out.print(i + " ");
            }
        }
    }

}
