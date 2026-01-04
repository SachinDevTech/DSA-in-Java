// Optimized Approach O(sqrt(n))
public class FindDivisorsOptimal{
    public static void main(String[] args) {
        int n = 20;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(i == 0){
                return;
            }
            if(n/i == 0){
                System.out.print(i + " ");
            }
        }
    }
}