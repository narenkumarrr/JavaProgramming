
public class trappingRainwater {
    public static int trappedRainwater(int height[]) {
        int trappedWater = 0;
        // calculate left max boundary -array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        // calculate right max boundary array
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        // loop
        for (int i = 1; i < height.length - 1; i++) {
            // waterLevel = min(leftMax,rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trappedWater = waterLevel-height[i]
            trappedWater += (waterLevel - height[i]);
        }
        return trappedWater;

    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.print(trappedRainwater(height));
    }
}
