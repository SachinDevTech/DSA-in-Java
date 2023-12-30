public class get_IthBit {
    public static int getIthBit(int n , int i) {
        int bitMask = 1<<i; //Main logic to understand
        if ((n & bitMask) == 0) {
            return 0;
        }
        return 1;

    }

    public static void main(String[] args) {
        int num = 3;
        int i = 1; //is used to check the bit at i'th position
        System.out.println("I'th Bit is: " + getIthBit(num, i));
    }
}
