public class _4_LinearSearch {
    public static int linearSearch(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String arr[] = { "Samosa", "Dosa", "Idli", "Chhole" };
        String key = "Idli";
        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.println("Key is NOT found.");
        } else {
            System.out.println("Key is found at " + index);
        }
    }
}
