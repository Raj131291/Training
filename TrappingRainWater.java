public class TrappingRainWater {

    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int n = height.length;
        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int waterTrapped = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    waterTrapped += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    waterTrapped += rightMax - height[right];
                }
                right--;
            }
        }

        return waterTrapped;
    }
    public static void main(String[] args) {

        //int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
       // System.out.println(trap(height1)); // Output: 6

        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height2)); // Output: 9

    }
}
