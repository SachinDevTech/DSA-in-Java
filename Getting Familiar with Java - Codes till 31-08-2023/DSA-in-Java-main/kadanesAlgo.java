public class kadanesAlgo {
    public static void subarraySum(int arr[]) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            if (curSum < 0) {
                curSum = 0;
            }
            if (curSum > maxSum) { // maxValue = Math.max(maxValue, curSum)
                maxSum = curSum;
            }
            
        }

        System.out.println("\n" + maxSum + "\n");
    }

    public static void main(String[] args) {
        int arr[] = { 2, -3, 4, -1, -2, 1, 5, -3 };
        subarraySum(arr);
    }
}
