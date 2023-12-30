public class _6_PrintDigitsinIncOrder {
    public static void printDigits(int num) {
        // base case
        if (num <= 0) {
            return;
        }
        int digit = num % 10;
        num /= 10;
        printDigits(num);
        System.out.print(digit + " ");
    }

    public static void main(String[] args) {
        int num = 0647; // Octal representation of 647 because it is leading with zero so it will be
                        // treated as an Octadecimal value and at the function call it will be converted into decimal repre.
        String numStr = "0647";

        // Remove leading zeros if present and parse as decimal integer
        if (numStr.charAt(0) == '0') {
            num = Integer.parseInt(numStr);
        }

        printDigits(num);
    }
}
