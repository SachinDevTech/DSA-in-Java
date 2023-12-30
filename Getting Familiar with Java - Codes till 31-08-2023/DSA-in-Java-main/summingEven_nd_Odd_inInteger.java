import java.util.Scanner;

public class summingEven_nd_Odd_inInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        while (integer > 0) {
            int ld = integer % 10;
            if (ld % 2 == 0) {
                evenSum += ld; //evenSum = evenSum + ld;
            } else {
                oddSum += ld; //oddSum = oddSum + ld;
            }
            integer = integer / 10;
        }
        System.out.println("Even Sum is: " + evenSum);
        System.out.println("Odd Sum is: " + oddSum);
    }

}
