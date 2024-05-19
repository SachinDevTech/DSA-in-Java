import java.util.ArrayList;

public class _01_Intro {
    public static void main(String[] args) {
        // System.out.println("Hello World!"); // Uncomment to print "Hello World!"

        // Demonstrating ArrayList with different data types
        // ArrayList<Integer> -----> ArrayList is a class that uses generics to specify the type of elements (here Integer)
        // list1 etc ------> These are objects of the ArrayList class
        // new -----> Allocates memory for the new ArrayList object in the heap
        // ArrayList ----> The ArrayList class itself
        // <> ------> Diamond operator, used to specify the type parameter for generics
        // () ----> Calls the constructor of the ArrayList class
        ArrayList<Integer> list1 = new ArrayList<>(); // For Integer type of data
        ArrayList<Float> list2 = new ArrayList<>(); // For Float type of data
        ArrayList<Double> list3 = new ArrayList<>(); // For Double type of data
        ArrayList<Character> list4 = new ArrayList<>(); // For Character type of data
        ArrayList<Boolean> list5 = new ArrayList<>(); // For Boolean type of data
        ArrayList<Byte> list6 = new ArrayList<>(); // For Byte type of data
        ArrayList<Long> list7 = new ArrayList<>(); // For Long type of data
        ArrayList<Short> list8 = new ArrayList<>(); // For Short type of data
    }
}
