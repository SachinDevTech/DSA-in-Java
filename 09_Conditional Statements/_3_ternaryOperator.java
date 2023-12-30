import java.util.*;

public class _3_ternaryOperator {
    public static void main(String[] args) {
        // anyVariable = condition ? statement-1 : statement-2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check ODD-EVEN: ");
        int number = sc.nextInt();
        String checkOddEven = (number % 2 == 0) ? "Even" : "Odd"; 
        System.out.println("The number "+ number+ " is " + checkOddEven +".");
    }
}