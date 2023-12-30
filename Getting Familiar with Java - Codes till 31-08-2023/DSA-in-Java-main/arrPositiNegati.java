public class arrPositiNegati {
    public static boolean checkPositNegat(int arr[]){
        boolean arrSign = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0) {
                arrSign = false;
            }
        }
        return arrSign;
    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        int arr[] = {-1,-2,3,-4};
        System.out.println("Is Positive : "+checkPositNegat(arr));
    }
}
