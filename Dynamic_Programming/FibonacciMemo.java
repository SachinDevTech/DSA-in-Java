
public class FibonacciMemo {

    public static int calcFib(int n, int dp[]) {
        if (n == 0 | n == 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = calcFib(n - 1, dp) + calcFib(n - 2, dp);
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 7;
        int fib[] = new int[n + 1];
        System.out.println("Fibonacci value of " + n + " is: " +  calcFib(n, fib));
    }
}
