public class linearSearchPractice {
    public static void LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("\n"+key + " is Present at index: " + i + "\n");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1,0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 10;
        LinearSearch(arr, key);
    }
}
