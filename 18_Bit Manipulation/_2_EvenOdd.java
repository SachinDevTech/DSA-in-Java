public class _2_EvenOdd {
    public static void main(String[] args) {
        int num = 11;
        // Using bitwise AND operator to check the least significant bit
        if ((num & 1) == 0) {
            System.out.println("Even Number.");
        } else {
            System.out.println("Odd Number.");

        }
    }
}
