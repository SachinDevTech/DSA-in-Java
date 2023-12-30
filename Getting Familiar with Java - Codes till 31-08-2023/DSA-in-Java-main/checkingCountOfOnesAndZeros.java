public class checkingCountOfOnesAndZeros {
    public static void countingOnesAndZeros(int brr[], int size){
        int numOne = 0;
        int numZero = 0;
        for(int i = 0; i< size; i++ ){
            if(brr[i] ==1){
                numOne++;
            }
            if(brr[i] ==0){
                numZero++;
            }
        }
        System.out.println("\nZeros are: " + numZero + " \nAnd numOne are: " + numOne +"\n");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 0, 0, 0, 1 };
        int size = arr.length;
        countingOnesAndZeros(arr, size);
    }
}
