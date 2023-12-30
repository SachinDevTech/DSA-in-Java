public class _3_ArrayAsArgument {
    public static void updateMarks(int marks[]) { // array is passed in updateMarks fxn.
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1; // marks updated
        }
    }

    public static void main(String[] args) {
        int arr[] = { 89, 95, 98 }; // marks: {chemistry, physics and Maths};
        updateMarks(arr);//called fxn to update this array


        // See the updated array which holds terminology call by reference as it is a
        // non-primitive data type in java.

        System.out.print("The updated array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
