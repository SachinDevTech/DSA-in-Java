public class fastExponentiation {
    public static void fastExpo(int a, int n) {
        int ans = 1;
        int baseValue = a, pow = n;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = a * ans;
            }
            a = a * a;
            n = n >> 1;
        }
        System.out.println("The value of " + baseValue + " to the power " + pow + " is: " + ans);
    }

    public static void main(String[] args) {
        int a = 5;
        int n = 3;
        fastExpo(a, n);

    }
}
