public class _1_Operators {
    public static void main(String[] args) {
        // Bit mainipulation operators:
        int num1 = 5;
        int num2 = 6;

        // OR , & and ^

        System.out.println("num1 | num2 is: " + (num1 | num2));
        System.out.println("num1 & num2 is: " + (num1 & num2));
        System.out.println("num1 ^ num2 is: " + (num1 ^ num2));

        // Left shift and right shift operators
        System.out.println("num1>>2: " + (num1 >> 2));
        System.out.println("num1<<2: " + (num1 << 2));
        System.out.println("num2>>2: " + (num2 >> 2));
        System.out.println("num2<<2: " + (num2 << 2));

    }
}