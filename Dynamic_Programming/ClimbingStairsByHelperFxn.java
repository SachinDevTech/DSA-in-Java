
class ClimbingStairsByHelperFxn {
    //Main fxn
    public static void main(String args[]){
        int n = 5;
        int[] memo = new int[n + 1];
        System.out.println(climbStairsHelper(n, memo));
    }
    //Helper fxn
    public static int climbStairsHelper(int n, int[] memo) {
        // Base case: 1 way to reach the 0th or 1st step
        if (n <= 1) {
            return 1; 
        }
        // Return already computed result
        if (memo[n] != 0) {
            return memo[n]; 
        }
        
        // Calculate the result recursively and store it in memo array
        memo[n] = climbStairsHelper(n - 1, memo) + climbStairsHelper(n - 2, memo);
        return memo[n];
    }
}

