public class PowerOfTwo {

    // Recursive function to check if n is a power of two
    public static boolean isPowerOfTwo(int n) {
        // Base case: 1 is a power of two (2^0 = 1)
        if (n == 1) {
            return true;
        }
        // Base case: if n is less than 1, it's not a power of two
        if (n < 1 || n % 2 != 0) {
            return false;
        }
        // Recursive step: divide n by 2 and check again
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        int num = 15; // Example number to check
        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of two.");
        } else {
            System.out.println(num + " is not a power of two.");
        }
    }
}
