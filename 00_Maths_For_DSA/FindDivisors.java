// Brute Force Approach O(n)
public class FindDivisors {
    public static void main(String[] args) {
        int n = 20;
        for(int i = 1; i <= n; i++){
            if(n==0){
                return;
            }
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}