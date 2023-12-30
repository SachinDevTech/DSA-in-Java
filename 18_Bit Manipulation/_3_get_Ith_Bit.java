public class _3_get_Ith_Bit {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i; //to find the bitMask
        int bit = (n & bitMask) >> i; // Get the i-th bit value (0 or 1) and this line moving that bit at LSB and then we'are returning in the below line.
        return bit;
    }

    public static void main(String[] args) {
        int ans = getIthBit(10, 2);
        System.out.println("\nThe i'th bit is: " + ans + "\n");
    }
}
