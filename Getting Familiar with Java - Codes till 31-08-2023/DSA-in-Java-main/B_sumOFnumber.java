import java.util.Scanner;

// public class B_sumOFnumber {
//     public static void calculatesum(int a, int b) {
//         int sum = a + b;
//         System.out.println("The sum of " + a + " and " + b + " is " + sum);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter values num1 and num2: ");
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         calculatesum(num1, num2);
//     }

// ----------------------------------

public class B_sumOFnumber {
    public static int calculatesum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values num1 and num2: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = calculatesum(num1, num2);
        System.out.println("Sum is: " + sum);
    }
}
