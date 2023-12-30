public class _1_ifElse {
    public static void main(String[] args) {
        // Can you Vote ?
        int age = 20;
        if (age > 18) {
            System.out.println("I can Vote.");
        } else {
            System.out.println("I can't Vote.");
        }

        // Find largest of the two numbers.

        int num1 = 20, num2 = 102;
        if (num1 > num2) {
            System.out.println("num1 is Greater.");
        } else {
            System.out.println("num2 is Greater.");
        }

        // Find "EVEN" and "ODD".
        int num = 21;
        if (num % 2 == 0) {
            System.out.println("Even Number.");
        } else {
            System.out.println("Odd Number.");
        }
    }
}