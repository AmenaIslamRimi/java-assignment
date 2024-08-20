// 4. Generate random 10 integer numbers in an array
// and print out all the numbers from the array
// and also print the max and min number from the array.

public class RandomNumber {
    public static void main(String[] args) {
        generateRandomNumbers();
    }

    public static void generateRandomNumbers() {
        int[] numbers = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            System.out.println(numbers[i]);

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
