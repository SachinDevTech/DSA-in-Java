public class bruteForce {
    public static void Max_By_Brute_Force(int arr[]) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                    if (currSum > maxValue) {
                        maxValue = currSum;
                    }
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Max of subArray: " + maxValue);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        Max_By_Brute_Force(arr);
    }
}
