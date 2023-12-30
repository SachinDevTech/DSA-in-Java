import java.util.*;
public class E_FactorialOfNumber {
    
    public static int Factoriil(int num){
        int f =1;
        for (int i = 1; i <= num; i++) {
            f = f * i;

        }
        return f;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // int number =10;
        int ans = Factoriil(number);
        System.out.println(ans);
    }
}