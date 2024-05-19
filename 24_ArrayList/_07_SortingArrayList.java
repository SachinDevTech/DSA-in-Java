import java.util.ArrayList;
import java.util.Collections;

public class _07_SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int idx1 = 1, idx2 = 3;
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        Collections.sort(list); // Sorted in ascending order by default
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); //Used comparator and in DESC order 
        System.out.println(list);

    }
}
