public class _9_PrintSubarrays {
    public static void printingSubarrays(int arr[]) {
        // Nested loops to iterate through all possible start and end indices
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                // Create subarray from start to end indices
                System.out.print("Subarray: ");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printingSubarrays(arr);
    }
}
