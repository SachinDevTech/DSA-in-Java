import java.util.*;

public class oddOrEven {
    public static void checkOddEven(int num) {
        int bitMask = 1;
        if ((num & bitMask) == 1) {
            System.out.println("\n" + num + " is an Odd Number\n");
        } else {
            System.out.println("\n" + num + " is an Even Number\n");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the value to check Odd or Even: ");
        int num = sc.nextInt();
        // int num = 9;
        checkOddEven(num);

    }
}
