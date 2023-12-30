public class sumofNNN {
    public static void main(String[] args) {
        int ans = sumof_N_NaturalNo(100);
        System.out.println("Ans is: " + ans);
    }

    public static int sumof_N_NaturalNo(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumof_N_NaturalNo(n - 1);
    }
}
