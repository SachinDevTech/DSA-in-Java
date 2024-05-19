import java.util.ArrayList;;

public class _02_OperationsOnList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Operations on ArrayList:

        //add element - TC: O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3,5); //It adds value at the index and the existing value shifts to just next index. TC: O(n) 
        System.out.println(list);

        //get element - TC: O(1)
        int gettingElement = list.get(3); //this fxn takes index as input and returns value from the list.
        System.out.println(gettingElement);

         // set element - TC: O(1)
         list.set(2, 10); // sets the element at index 2 to 10
         System.out.println(list);
 
         // remove element by index - TC: O(n)
         list.remove(1); // removes the element at index 1
         System.out.println(list);
 
         // remove element by value - TC: O(n)
         list.remove(Integer.valueOf(10)); // removes the first occurrence of the value 10
         System.out.println(list);
 
         // size of the list - TC: O(1)
         int size = list.size(); // returns the number of elements in the list
         System.out.println("Size: " + size);
 
         // check if list is empty - TC: O(1)
         boolean isEmpty = list.isEmpty(); // returns true if the list is empty, false otherwise
         System.out.println("Is empty: " + isEmpty);
 
         // check if list contains a value - TC: O(n)
         boolean containsValue = list.contains(3); // returns true if the list contains the value 3
         System.out.println("Contains 3: " + containsValue);
 
         // iterate through the list - TC: O(n)
         for (int value : list) { // iterates through each element in the list
             System.out.println(value);
         }
 
         // clear the list - TC: O(n)
         list.clear(); // removes all elements from the list
         System.out.println("List after clear: " + list);
     }
 }