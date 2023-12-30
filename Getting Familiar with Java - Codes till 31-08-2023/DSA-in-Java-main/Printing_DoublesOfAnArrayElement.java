import java.util.*;

public class Printing_DoublesOfAnArrayElement {
    public static void PrintingArrayDoubles(int arr[]) {
        System.out.println("Enter the array elemnts: ");
        // Array elements are initialized in an array arr.
        // for (int i = 0; i < arr.length; i++) {
        //     Scanner sc = new Scanner(System.in);
        //     arr[i] = sc.nextInt();
        // }

        // Initializing array with the element 1
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i] = 1; //same for zero
        }
        // Array is printed
        for (int i = 0; i < arr.length; i++) {
            System.out.print((2/2) * arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5]; // This is the method to initialize an array in Java
        PrintingArrayDoubles(arr);
    }
}
