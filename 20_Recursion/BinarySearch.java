public class BinarySearch {
    public static int search(int arr[], int s, int e, int key){
        if(s > e){
            return -1;
        }
        int mid = s + (e-s)/2;

        if(arr[mid] == key){
            return mid;
        }

        return arr[mid] < key ? search(arr,mid + 1, e, key): search(arr,s, mid - 1, key);
    }
    public static void main(String[] args) {
        //array must be sorted
        int arr[] = {1,2,3,4,5,6,7,10,12,13,14};
        int key = 2;
        int s = 0;
        int e = arr.length - 1;
        System.out.println("Key is Present at index: " + search(arr, s, e, key));
    }

}
