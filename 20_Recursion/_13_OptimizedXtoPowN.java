public class _13_OptimizedXtoPowN {
    public static int optimizedPower(int a, int n) {
        // calculating in O(logN)
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;

    }

    public static void main(String[] args) {
        int a = 2, n = 5;
        int ans = optimizedPower(a, n);
        System.out.println("The ans is: " + ans);
    }
}
