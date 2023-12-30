public class _6_clearIthBit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i); // Create a mask with 0 at the i-th position
        return n & bitMask; // Perform AND operation to clear the i-th bit
    }

    public static void main(String[] args) {
        int ans = clearIthBit(15, 1);
        System.out.println("The ans after clearing the i'th bit is: " + ans);
    }
}
