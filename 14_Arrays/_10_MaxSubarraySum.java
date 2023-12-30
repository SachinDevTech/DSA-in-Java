// Brute force method
public class _10_MaxSubarraySum {
    public static void MaxSubarraySum(int arr[]) {
         int ts = 0;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int sumOFARR = 0; // because loop will start repeating from here
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                    sumOFARR += arr[i];
                    if (sumOFARR > maxValue) {
                        maxValue = sumOFARR;
                    }
                    if (sumOFARR < minValue) {
                        minValue = sumOFARR;
                    }
                }
                ts++;
                System.out.println(" --> Sum is: " + sumOFARR);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays are: " + ts + "\n");
        System.out.println("Max value in subarray is: " + maxValue + "\n");
        System.out.println("Min value in subarray is: " + minValue + "\n");
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        MaxSubarraySum(arr);
    }
}