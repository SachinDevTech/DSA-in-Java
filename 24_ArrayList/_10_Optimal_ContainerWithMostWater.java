import java.util.ArrayList;
public class _10_Optimal_ContainerWithMostWater {
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
        int ans = ContainerWithMaxWater(arr);
        System.out.println(ans);
    }

    public static int ContainerWithMaxWater(ArrayList<Integer> arr){
        int lp = 0, rp = arr.size() - 1, maxWater = 0;
        
        while(lp < rp){
            //calculate water area
            int ht = Math.min(arr.get(lp), arr.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            //updating pointer
            if (arr.get(lp) < arr.get(rp) ) {
                lp++;
            }else {
                rp--;
            }
        }
        return maxWater;
    }

}
