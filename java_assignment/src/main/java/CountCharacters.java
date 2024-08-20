// Find the number of occurrences of characters in a String
//String: I live in Dhaka
//Output:
//i 3
//l 1
//v 1
//e 1
//d 1
//h 1
//a 2
//k 1

public class CountCharacters {
    public static void main(String[] args) {
        countCharacters("I live in Dhaka");
    }

    public static void countCharacters(String str) {
        int count = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch || str.charAt(i) == Character.toUpperCase(ch)) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(ch + " " + count);
                count = 0;
            }
        }

    }
}
