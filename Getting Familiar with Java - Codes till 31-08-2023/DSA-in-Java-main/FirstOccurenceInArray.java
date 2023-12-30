public class FirstOccurenceInArray {
    public static int firstOccurence(int arr[], int key, int start) {
        if (start == arr.length) {
            return -1;
        }
        if (arr[start] == key) {
            return start;

        } else {
            return firstOccurence(arr, key, start + 1);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 3, 4, 5, 60, 75 };
        int key = 5;
        int starting_Address = 0;
        System.out.println("Present at: " + firstOccurence(arr, key, starting_Address));
        // if present the it will return index
        // if not present then it will return -1

    }
}