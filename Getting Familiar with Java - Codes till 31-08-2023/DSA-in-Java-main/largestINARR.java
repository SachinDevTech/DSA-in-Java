public class largestINARR {
    public static void LargestInArray(int arr[]){
        int largestValue = Integer.MIN_VALUE;
        // int curValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestValue) {
                largestValue = arr[i];
            }
        }
        System.out.println("Largest is: "+ largestValue);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6, 100, -1};
        LargestInArray(arr);

    }
}
