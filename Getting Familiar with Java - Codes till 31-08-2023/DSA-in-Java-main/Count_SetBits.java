public class Count_SetBits {
    public static void countSetBits(int number) {
        int count = 0;
        int myNum = number;
        while (number > 0) {
            if ((number & 1) != 0) {
                count++;
            }
            number = number >> 1;
        }
        System.out.println("\nNumber of set bits in " + myNum + " is " + count + "\n");

    }

    public static void main(String[] args) {
        int num = 7;
        countSetBits(num);

    }
}
