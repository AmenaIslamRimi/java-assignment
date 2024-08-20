// 7. Take input as height of 10 babies in cm.
// Now find out the 2 lowest height of babies.
// (Don’t use Arrays.sort() method)

public class HeightCalculate {
    public static void main(String[] args) {
        int[] heights = {100, 60, 110, 90, 70, 120, 80, 130, 50, 140};
        findSecondLowestHeight(heights);

    }
    public static void findSecondLowestHeight(int[] heights) {

        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];

            if (height < lowest) {
                secondLowest = lowest;
                lowest = height;
            } else if (height < secondLowest && height > lowest) {
                secondLowest = height;
            }
        }

        System.out.println("The 2nd lowest height is: " + secondLowest);
    }
}
