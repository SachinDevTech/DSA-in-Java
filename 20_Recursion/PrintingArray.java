public class PrintingArray {
    public static void printArr(int arr[], int size, int index){
        //base case
        if(index >= size){
            return;
        }
        //what to get done?
        System.out.print(arr[index] + " ");
        //recursive relation
        printArr(arr, size, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int size = arr.length;
        int index = 0;
        printArr(arr, size, index);
    }
}
