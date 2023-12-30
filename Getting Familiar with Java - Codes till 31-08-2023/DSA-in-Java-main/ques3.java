public class ques3 {
    public static void main(String[] args) {
        String str = "Hii, I am Sachin Kumar.";
        int vowelCounts = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vowelCounts++;

            }
        }
        System.out.println("\nLowecase Vowel Letters are: " + vowelCounts + "\n");
    }
}
