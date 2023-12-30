import java.util.Scanner;

public class D_ProdOfTwo {

    public static int prod(int a, int b) {
        int prdct = a * b;
        return prdct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of num1: ");
        int num2 = sc.nextInt();
        int answer = prod(num1, num2);
        System.out.println("Answer is: " + answer);

    }
}
