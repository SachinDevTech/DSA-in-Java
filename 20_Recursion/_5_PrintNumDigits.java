public class _5_PrintNumDigits {
    //this is printing in reverse order
    public static int printDigits(int num) {
        // base case
        if (num <= 0) {
            return 0;
        }
        int digit = num % 10;
        System.out.print(digit + " "); // Remove the space after digit
        num /= 10; //shortening the length of the num by deviding 10
        return printDigits(num);
    }

    public static void main(String[] args) {
        int num = 123;
        printDigits(num);
    }
}
