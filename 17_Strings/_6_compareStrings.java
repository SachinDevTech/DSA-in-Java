public class _6_compareStrings {
    public static void main(String[] args) {
        String str1 = "Sachin";
        String str2 = "Sachin";
        String str3 = new String("Sachin");
        if (str1 == str2) {
            System.out.println("str1 and str2 are equal.");
        }
        else{
            System.out.println("Not equal.");
        }
        if (str1 == str3) {
            System.out.println("str1 and str3 are equal.");
        }
        else{
            System.out.println("Not Equal.");
        }
        if (str1.equals(str3)) { //this function basically checks the equality of the value.
            System.out.println("str1 and str3 are equal.");
        }
        else{
            System.out.println("Not Equal.");
        }
    }
}
