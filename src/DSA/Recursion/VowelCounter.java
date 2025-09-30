package DSA.Recursion;

import java.util.Scanner;

public class VowelCounter {

    // Recursive function to count vowels
    public static int countVowels(String str) {
        // Base case: empty string or null
        if (str == null || str.length() == 0) {
            return 0;
        }
        int current_character =isVowel(str.charAt(0))?1:0;

        return current_character + countVowels(str.substring(1)); // placeholder
    }

    // Helper function to check if a character is a vowel
    public static boolean isVowel(char ch) {
        char lowerCh = Character.toLowerCase(ch);

        // Check if it's one of the vowels
        return lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' ||
                lowerCh == 'o' || lowerCh == 'u';
        // placeholder
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Recursive Vowel Counter ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }
}