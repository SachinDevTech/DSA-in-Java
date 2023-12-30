public class _10_Remove_Special_chars {
    public static String removeChars(String input){
        if (input == null) {
            return ""; // Or handle the null case as required
        }
        input = input.replaceAll("[^a-zA-Z0-9]", "");
        return input;
    }

    public static void main(String[] args) {
        String input = "";
        String ans = removeChars(input);

        System.out.println("The final output after removing special chars: " + ans);
    }
}
