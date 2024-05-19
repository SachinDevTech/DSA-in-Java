import java.util.ArrayList;

public class _06_SwappingValuesInArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int idx1 = 1, idx2 = 3;
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        swap(list, idx1, idx2); // passed an ArrayList along with index1 and index2;
        System.out.println(list);
    }

    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
