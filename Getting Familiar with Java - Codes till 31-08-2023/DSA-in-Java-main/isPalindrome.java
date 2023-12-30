import java.util.*;

public class isPalindrome {
    public static void isPal(int num) {
        int myNum = num;
        int reversed = 0;
        while (num > 0) {
            int ld = num % 10;
            reversed = reversed * 10 + ld;
            num /= 10;
        }
        // System.out.println(myNum);
        // System.out.println(reversed);

        if (myNum == reversed) {
            System.out.println("Yes, It is Palindrome");
        } else {
            System.out.println("No, It's not a Palindrome");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPal(num);
    }
}
