public class ClimbingStairs {

    public static int calcWays(int n, int dp[]) {
        //standing at the ground floor is having one case.
        if (n == 0) {
            return 1;
        }
        //can't go under the floor, no such stair exist to go inside.
        if (n < 0) {
            return 0;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
            
        dp[n] = calcWays(n - 1, dp) + calcWays(n - 2, dp);

        return dp[n];
    }
    
    public static void main(String args[]) {
        int n = 5;
        int arr[] = new int[n + 1];  // Initialize with n + 1 to cover all steps up to n
        System.out.println("Total possible ways of climbing: " + calcWays(n, arr));
    }
}
