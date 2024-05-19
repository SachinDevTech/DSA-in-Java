import java.util.ArrayList;

public class _08_MultidimensionalArray {
    public static void main(String[] args) {
        //Creating mainList containing three lists
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
        //Loop to add values in the list
        for (int i = 1; i <= 10; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        //adding each list to mainList
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        //Printing ArrayList
        System.out.println(mainList);
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);

            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }


    }
}
