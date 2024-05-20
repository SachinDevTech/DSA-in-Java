import java.util.ArrayList;

public class _11_Optimal_PairSum {
      public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int target = 5;
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        boolean ans = BrutePairSum(arr, target);
        System.out.println("The answer is: " + ans);
      }
      public static boolean BrutePairSum(ArrayList<Integer> arr, int target){
        //TC = O(n)
        int lp = 0,  rp = arr.size() - 1;
        while(lp < rp){
            //case - 1 of ans
            if (arr.get(lp) + arr.get(rp) == target) {
                return true;
            } else if(arr.get(lp) + arr.get(rp) > target){ //case - 2 of large sum so will move rp to left by rp--
                rp--;
            } else{
                lp++;
            }
        }
        return false;
      }
}

