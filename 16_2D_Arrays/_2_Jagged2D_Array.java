// package 16_2D_Arrays;

public class _2_Jagged2D_Array {
    public static void main(String[] args) {
        int[][] jaggedArray = {
            { 1, 2, 3 },
            { 4, 5 },
            { 6, 7, 8, 9 }
        };
        
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray.length; j++) {
                System.out.println(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
