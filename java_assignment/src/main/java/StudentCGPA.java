// 1. Here is the 10 students CGPA [3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75]
//     Find out who achieved the 2nd highest score. (without sorting, use linear searching algorithm)
//2. Sort the above scores from according to the order of highest CGPA
// (don’t use Arrays.sort() method, do it programmatically)
//3. Take a CGPA as user input.
// Now from the given array find if your input CGPA is present using binary search algorithm

public class StudentCGPA {
    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        findSecondHighestCGPA(cgpas);
        sortCGPA(cgpas);
        findUserInputCGPA(cgpas, 3.60);
        findUserInputCGPA(cgpas, 3.65);
    }
    public static void findSecondHighestCGPA( double[] cgpas) {
        double highest = Double.MIN_VALUE;
        double secondHighest = Double.MIN_VALUE;

        for (int i = 0; i < cgpas.length; i++) {
            double cgpa = cgpas[i];

            if (cgpa > highest) {
                secondHighest = highest;
                highest = cgpa;
            } else if (cgpa > secondHighest && cgpa < highest) {
                secondHighest = cgpa;
            }
        }

        System.out.println("The 2nd highest CGPA is: " + secondHighest);
    }

    public static void sortCGPA(double[] cgpas) {
        for (int i = 0; i < cgpas.length - 1; i++) {
            for (int j = i + 1; j < cgpas.length; j++) {
                if (cgpas[i] < cgpas[j]) {
                    double temp = cgpas[i];
                    cgpas[i] = cgpas[j];
                    cgpas[j] = temp;
                }
            }
        }

        System.out.println("Sorted CGPAs in descending order:");
        for (int i = 0; i < cgpas.length; i++) {
            System.out.println(cgpas[i]);
        }
    }

    public static void findUserInputCGPA(double[] cgpas, double userInput) {
        boolean isFound = false;
        for (int i = 0; i < cgpas.length; i++) {
            if (cgpas[i] == userInput) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("The CGPA " + userInput + " is found.");
        } else {
            System.out.println("The CGPA " + userInput + " is not found.");
        }
    }
}
