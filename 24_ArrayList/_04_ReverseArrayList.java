import java.util.ArrayList;
public class _04_ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4,5); //Take O(n) time remember
        System.out.println(list);


        //Printing Reverse the ArrayList
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(i + " ");
        }
    }
}
