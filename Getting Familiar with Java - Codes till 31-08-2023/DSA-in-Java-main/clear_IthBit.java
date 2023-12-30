public class clear_IthBit {
    public static int clearIthBit(int n, int i) {
        return (n & ~(1 << i)); // Clears the ith-bit by performing
    }

    public static void main(String[] args) {
        System.out.println("\nAfter setting bit, Number is: " + clearIthBit(10, 1) + "\n");
    }
}

// Please try to dry run it at least once while you are looking at me.