/**
 * Trapping Rainwater Problem
 */
public class ArraysCC {
    public static int trappedRainwater(int height[]) {
        int n = height.length;
        int totalTrappedWater = 0;

        // Calculate leftMax
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate rightMax
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        // Loop
        for (int i = 0; i < n; i++) {
            // Calculate waterLevel
            int waterLevel = Math.min(leftMax[i], rightmax[i]);
            // Calculate total trappedWater
            totalTrappedWater += waterLevel - height[i];
        }
        return totalTrappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainwater(height));
    }
}