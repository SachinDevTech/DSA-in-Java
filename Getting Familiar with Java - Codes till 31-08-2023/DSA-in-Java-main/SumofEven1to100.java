
// Write a Java code snippet to swap the values of two variables without using a third variable.?
import java.util.Scanner;

public class SumofEven1to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= number; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}