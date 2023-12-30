public class _5_flip_Ith_Bit {
    public static int flip_Ith_Bit(int n, int i) {
        int bitMask = 1 << i;
        return (n ^ bitMask);
    }

    public static void main(String[] args) {
        int ans = flip_Ith_Bit(8, 1);
        System.out.println("The ans after clearing the i'th bit is: " + ans);
    }
}
