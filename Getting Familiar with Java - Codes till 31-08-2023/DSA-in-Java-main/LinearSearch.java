public class LinearSearch {
    public static int linearSearch(int arr[], int key) {
        // int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                // count++;
                return 1;
            }
        }
        // System.out.println(count + " hh");
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4 };
        int key = 4;
        System.out.println("\nElement found: " + linearSearch(arr, key) + "\n");
    }
}
