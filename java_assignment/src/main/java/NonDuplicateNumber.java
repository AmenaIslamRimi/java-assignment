// 10. Print the  numbers which are not duplicate from the given array.
//numbers=[1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7]
//Output:
//3, 6, 7

public class NonDuplicateNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};
        printNonDuplicateNumbers(numbers);
    }

    public static void printNonDuplicateNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print( numbers[i] + " ");
            }
        }
    }
}
