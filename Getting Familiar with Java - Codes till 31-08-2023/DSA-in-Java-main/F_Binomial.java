import java.util.Scanner;

// This was quite time - taking
// ----------------------------------------
// public class F_Binomial {
//     public static int BinomialNum(int n, int r) {
//         int forN = 1;
//         int forR = 1;
//         int N_minus_R = 1;
//         for (int i = 1; i <= n; i++) {
//             forN = forN * i;
//         }
//         for (int i = 1; i <= r; i++) {
//             forR = forR * i;
//         }
//         for (int i = 1; i <= (n-r)  ; i++) {
//             N_minus_R = N_minus_R * i;            
//         }
//         int ans = (forN) / (forR * N_minus_R );
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();
//         int ans = BinomialNum(n, r);
//         System.out.println(ans);
//     }
// }

//  This is good
// public class F_Binomial {
//     public static int BinomialNum(int n) {
//         int f = 1;
//         for (int i = 1; i <= n; i++) {
//             f = f * i;
//         }
//         return f;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of n: ");
//         int n = sc.nextInt();
//         System.out.println("Enter the value of r: ");
//         int r = sc.nextInt();

//         int ans = BinomialNum(n) / (BinomialNum(r) * BinomialNum(n - r));
//         System.out.println("The Binomial coefficient is: " + ans);
//     }
// }

// This is best and excellent

public class F_Binomial {
    public static int factOfNumber(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BinomialNum(int n, int r) {
        int fact_N = factOfNumber(n);
        int fact_R = factOfNumber(r);
        int fact_NMR = factOfNumber(n - r);
        int ans = fact_N / (fact_R * fact_NMR);
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();

        int ans = BinomialNum(n, r);
        System.out.println("Ans is: "+ans);
    }
}
