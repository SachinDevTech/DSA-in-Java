
public class printDigits {

    public static void main(String[] args) {
        long num = 8755102735l;
        printDigit(num);
    }

    public static void printDigit(long n) {
        long rev = 0;
        while (n > 0) {
            long digit = n % 10;
            rev = rev * 10 + digit;
            System.out.println(rev + " ");
            n /= 10;
        }

        // Step 2: Print digits
        while (rev > 0) {
            long digit = rev % 10;
            System.out.print(digit + " ");
            rev /= 10;
        }
    }
}
