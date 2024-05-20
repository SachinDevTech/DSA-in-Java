import java.util.ArrayList;


//TC: O(n^2)
public class _09_Brute_ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);

        // System.out.println(arr);
        System.out.println(calcMaxWater(arr));

    }
    public static int calcMaxWater(ArrayList<Integer> arr){
        int maxWater = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int ht = Math.min(arr.get(i), arr.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater =  Math.max(currWater, maxWater);
            }
        }
        return maxWater;
    }
}
