// 8. Count number of words, number of characters without spaces,
// number of vowels and consonant from the given string:
//Input: I am a SQA Engineer
//Output:
//Words: 5
//Chars: 15
//Vowel: 8
//Consonant: 7

public class CountString {
    public static void main(String[] args) {
        countString("I am a SQA Engineer");
    }

    public static void countString(String str) {
        int words = 0;
        int chars = 0;
        int vowels = 0;
        int consonants = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                chars++;

                if (!inWord) {
                    words++;
                    inWord = true;
                }

                // Check for vowels (case-insensitive)
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels++;
                } else if (Character.isLetter(ch)) { // Count only alphabetic consonants
                    consonants++;
                }
            } else {
                inWord = false;
            }
        }

        System.out.println("Words: " + words);
        System.out.println("Chars: " + chars);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

