public class _4_set_Ith_Bit {
    public static int set_Ith_Bit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static void main(String[] args) {
        int ans = set_Ith_Bit(8, 1);
        System.out.println("After setting bit ans is: "+ ans);
    }
}
