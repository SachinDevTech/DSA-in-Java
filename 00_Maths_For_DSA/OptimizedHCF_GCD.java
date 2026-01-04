
public class OptimizedHCF_GCD {

    public static void main(String[] args) {
        System.out.println(gcd(75, 90));
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}
