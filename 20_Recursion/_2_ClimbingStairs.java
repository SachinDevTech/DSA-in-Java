public class _2_ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = climbStairs(n - 1) + climbStairs(n - 2);
        return ans;
    }

    public static void main(String[] args) {
        int ans = climbStairs(2);
        System.out.println("The number of steps are: " + ans);
    }
}
