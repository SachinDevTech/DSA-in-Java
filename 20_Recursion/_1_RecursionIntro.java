import java.util.*;

public class _1_RecursionIntro {
    public static int findFactorial(int n) {
        System.out.println("Function is called for: " + n);
        if (n == 1) {
            return 1;
        }

        //Desi and understandable method

        // int smallProblem = findFactorial(n - 1);
        // int badiProblem = n * smallProblem;
        // return badiProblem;

        //also 
        return n * findFactorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int ans = findFactorial(n);
        System.out.println("The factorial of " + n + " is " + ans);
        sc.close();
    }
}