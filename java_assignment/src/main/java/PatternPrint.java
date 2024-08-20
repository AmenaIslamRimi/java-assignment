// 6. Write a program that will give following output:
//12345
//1234
//123
//12
//1
//12
//123
//1234
//12345

public class PatternPrint {
    public static void main(String[] args) {
        printPattern();

    }

    public static void printPattern() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
