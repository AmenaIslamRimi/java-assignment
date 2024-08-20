// 5. Write a program that will break down the amount and count notes for any given amount.
// Here is the notes in the given array:
//notes=[1000,500,200,100,50,20,10,5,2,1]
//Input: 546
//Output:
//500 1
//20 2
//5 1
//1 1

public class CountNote {
    public static void main(String[] args) {
        countNotes(1234);
    }
    public static void countNotes(int amount) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        for (int i = 0; i < notes.length; i++) {
            int note = notes[i];
            int count = amount / note;

            if (count > 0) {
                System.out.println(note + " " + count);
                amount = amount % note;
            }
        }
    }
}
