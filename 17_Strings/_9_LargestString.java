public class _9_LargestString {
    public static String checkLargestString(String fruits[]) {
        String largest = fruits[0];
        String smallest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            //How compareTo() function works?
            //if str1.compareTo(str2) = 0 (Then, both strings are equal)
            //if str1.compareTo(str2) < 0 (str1 < str2)
            //if str1.compareTo(str2) > 0 (str1 > str2)
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
            if (smallest.compareTo(fruits[i]) > 0) {
                smallest = fruits[i];
            }
        }
        System.out.println("Smallest is: "+ smallest);
        return largest;
    }

    public static void main(String[] args) {
        String fruits[] = { "mango", "banana", "pomegranate", "pomegranatj" };
        String ans = checkLargestString(fruits);
        System.out.println("The largest string we got: " + ans);
    }
}
