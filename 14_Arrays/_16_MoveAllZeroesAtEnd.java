// Method - 1 (Brute)


// import java.util.ArrayList;

// public class _16_MoveAllZeroesAtEnd {
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 0, 3, 3, 0, 0, 4, 5, 4};
//         fixZeroesAtEnd(arr);
//         for (int i : arr) { //(int i = 0; i < arr.length; i++)
//             System.out.print(i + " ");
//         }
//     }

//     public static void fixZeroesAtEnd(int arr[]) {
//         ArrayList<Integer> temp = new ArrayList<>();
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 temp.add(arr[i]);
//             }
//         }
//         for (int i = 0; i < temp.size(); i++) {
//             arr[i] = temp.get(i);
//         }

//         for (int i = temp.size(); i < arr.length; i++) {
//             arr[i] = 0;
//         }
//     }
// }



// _______________________________________________________________________

//Method - 2 (Better)
class _16_MoveAllZeroesAtEnd {
    public static void pushZerosToEnd(int[] arr, int n) {
        
        int count =0;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<n)
        {
            arr[count] = 0;
            count++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,0,7,0,4,0,5,6,7,11,0,3,4};
        int n = arr.length;
        pushZerosToEnd(arr,n);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}