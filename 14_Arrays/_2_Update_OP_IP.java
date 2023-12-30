import java.util.*;

public class _2_Update_OP_IP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4]; // array created

        // Giving input to an array
        System.out.println("Enter data for Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();
        // Updating and displaying output of an array
        System.out.println("Updated output of an Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
            System.out.println(arr[i]);
        }

    }
}
