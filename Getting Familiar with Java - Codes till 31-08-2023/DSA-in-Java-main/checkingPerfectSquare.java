public class checkingPerfectSquare {

    public static boolean isPerfectSquare(int number) {
        if (number < 0) {
            return false; // Negative numbers are not perfect squares
        }

        int sqrt = (int) Math.sqrt(number); // Calculate the square root and convert it to an integer

        return sqrt * sqrt == number; // Check if the square of the square root equals the original number
    }

    public static void main(String[] args) {
        int number = 10;
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}
