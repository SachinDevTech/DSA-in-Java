public class firstOccurrence {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,2,1};
        int i = 0, key = 10;
        int ans = checkFirstOccur(arr,i, key);
        System.out.println("The key is present at: " + ans);
    }
    public static int checkFirstOccur(int arr[], int i, int key){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return checkFirstOccur(arr, i+1, key);
    }
}
