import java.util.ArrayList;

public class _05_MaxOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        // Finding Max in ArrayList
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            int largest = list.get(0); // Start with the first element
            for (int i = 1; i < list.size(); i++) { // Start loop from the second element
                if (list.get(i) > largest) {
                    largest = list.get(i);
                }
            }
            System.out.println("The largest value in this ArrayList is: " + largest);
        }
    }
}
