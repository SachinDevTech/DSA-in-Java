import java.util.*;

public class _4_checkVowelConsos {
    public static void checkVowels_Consonants(String str) {
        int countVowels = 0, countConsonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char currVowel = str.charAt(i);
            if (currVowel == 'a' || currVowel == 'e' || currVowel == 'i' || currVowel == 'o'
                    || currVowel == 'u') {
                countVowels++;
            } else {
                countConsonants++;
            }

        }
        System.out.println(
                "The vowels are " + countVowels + " and consonants are " + countConsonants + " in this input Text.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();
        inputText = inputText.toLowerCase();
        checkVowels_Consonants(inputText);
        sc.close(); // Close scanner when done to prevent resource leak
    }
}
