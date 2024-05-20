import java.util.ArrayList;
public class _11_Brute_PairSum {
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
        //TC = O(n^2)
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
}
