public class B_LinearSearch {
    public static int arrays(int arr[], int key) { // array is passed as argument
        for (int i = 0; i < arr.length; i++) { // arr.length defines the length of an array
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int myArr[] = { 2, 3, 4, 5, 6 }; // Creating an array
        int key = 6;
        int index = arrays(myArr, key); // array function called
        if(index== -1){
            System.out.println("Key NOT FOUND");
        }else{
            System.out.println("Index at which "+key+" found: " + index );
        }
    }
}
