import java.util.*;

public class palindromeNUM {
    public static int reversing_N(int n) {
        int reversed = 0;
        while (n > 0) {
            int ld = n % 10;
            reversed = ld + reversed * 10;
            n /= 10;
        }
        return reversed;

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter num to check palindrome: ");
        int palNum = inp.nextInt();
        int reversedNum = reversing_N(palNum);
        System.out.println("Revered num of " + palNum + " is " + reversedNum);

        // Checking Palindrome of number
        if (palNum == reversedNum) {
            System.out.println("Palindrome: " + true);
        } else {
            System.out.println("Palindrome: " + false);

        }
    }
}
