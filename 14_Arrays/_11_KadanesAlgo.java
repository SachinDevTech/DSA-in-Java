public class _11_KadanesAlgo {
    public static int kadanesSum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean allNegative = true; // Flag to track if all elements are negative

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum); // to calc max b/w maxsum & currsum

            if (arr[i] >= 0) {
                allNegative = false; // If any element is non-negative, set the flag to false
            }
        }
        if (allNegative) {
            return 0; // Return 0 if all elements are negative
        }
        return maxSum;



        





    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int maxSum = kadanesSum(arr);
        System.out.println("The max sum is: " + maxSum);
    }
}
