public class patternsPractice {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        // for (int i = 0; i < row; i++) {
        // for (int j = i ; j < col; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();

        // }

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j <=i; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();

        // }
        // for (int i = 0; i < row; i++) {
        // for (int j = 1; j <=i+1 ; j++) {
        // System.out.print(j);
        // }
        // System.out.println();

        // }
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // for (int i = 1; i <= row; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(i);
        // }
        // System.out.println();

        // }

    }
}
