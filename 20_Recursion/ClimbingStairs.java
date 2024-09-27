public class ClimbingStairs {

    // Recursive function to calculate the number of ways to reach the top
    public static int climbStairs(int n) {
        // Base cases
        if (n == 0) {
            return 1;  // 1 way to stay at the ground (no steps)
        }
        if (n == 1) {
            return 1;  // 1 way to take 1 step
        }
        // Recursive relation: climbStairs(n) = climbStairs(n-1) + climbStairs(n-2)
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        int n = 5; // Example: number of steps
        System.out.println("Number of ways to climb " + n + " steps: " + climbStairs(n));
    }
}
