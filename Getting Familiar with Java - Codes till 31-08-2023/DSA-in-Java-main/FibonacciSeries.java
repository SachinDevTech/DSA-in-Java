import java.util.Scanner;

public class FibonacciSeries {

    public static int fibonacciSeries(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // int fnm1 = fibonacciSeries(n - 1);
        // int fnm2 = fibonacciSeries(n - 2);
        // int fn = fnm1 + fnm2;
        return fibonacciSeries(n - 1)+ fibonacciSeries(n - 2);
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();
        System.out.println("Fib Series is: " + fibonacciSeries(num));
    }

}