import java.util.Arrays;

public class _13_FindMissingNo {
    public static int findMissingValue(int arr[]) {
        Arrays.sort(arr); // TC = O(n * log n)
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i]) {
                return i; // Return the index that doesn't match the value
            }
        }
        return arr.length; // If no missing number found, return the last expected number
    }

    public static int findMissingO_1(int arr[]) {
        //TC = O(n), SC = O(1)
        int len = arr.length;
        int expSum = (len * (len + 1)) / 2; //Sum of N natural numbers = (n * (n + 1)) / 2;
        int actSum = 0;
        for (int num : arr) {
            actSum += num;
        }
        return expSum - actSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 3,4, 5 };
        // int ans = findMissingValue(arr);
        int ans1 = findMissingO_1(arr);
        System.out.println("The missing value is: " + ans1);
    }
}