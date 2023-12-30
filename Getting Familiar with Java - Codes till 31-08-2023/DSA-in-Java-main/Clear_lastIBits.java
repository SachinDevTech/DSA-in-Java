public class Clear_lastIBits {
    int var1 = 12;
    String name = "Ankur";
    public static int clearIthBits(int n, int i) {
        return (n & ((~0) << i)); // ~0 = 11111111...1111 negative number
        // ~0<<2 = 1111.....1100
        // &(binary AND operator): returns only the bits that are set in both operands.
    }

    public static void main(String[] args) {
        int num = 7;
        int i = 2;
        System.out.println("\nValue after clearing Ith Bit is: " + clearIthBits(num, i) + "\n");
    }
}
