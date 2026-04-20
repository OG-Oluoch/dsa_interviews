package twopointers;

/**
 * Given an integer array height of length n,
 * there are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]). Find two lines that together with the x-axis form a container,
 * such that the container contains the most water. Return the maximum amount of water a container can store.
 *
 *
 *  // The two-pointer approach works by initializing two pointers, one at the beginning of the array (left) and one at the end of the array (right).
 *  We calculate the area formed by the lines at these two pointers and update the maximum area if the current area is greater.
 *  Then, we move the pointer that points to the shorter line inward, as moving the taller line would not increase the area.
 *  We repeat this process until the two pointers meet, ensuring that we have checked all possible pairs of lines to find the maximum area.
 */

public class WaterTwoPointer {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};


        System.out.println("Result of optimized approach "+maxArea(height));
        System.out.println("Result of inefficient approach "+maxAreaBruteForce(height));
    }

    // this two pointer approach has a time complexity of O(n) and space complexity of O(1) as we are not using any extra space to store the non-zero elements.
    public static int maxArea(int[] height) {
        int left = 0; // pointer for the left line
        int right = height.length - 1; // pointer for the right line
        int maxArea = 0; // variable to store the maximum area

        while (left < right) {
            // calculate the area formed by the lines at left and right pointers
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea); // update max area if current area is greater

            // move the pointer that points to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    // this is a brute-force approach with a time complexity of 0(n^2)
    public static int maxAreaBruteForce(int[] height) {
        int n = height.length;
        int maxWater = 0;

        //check all pairs of i,j
        for(int i=0; i<n;i++){
            for(int j=i+1;j<n;j++){

                // height of the container
                int minHeight = Math.min(height[i],height[j]);
                int width = j-1; //distance between the two lines
                int area = minHeight * width; // area of the water container

                maxWater = Math.max(maxWater,area); //update the max water

            }

        }

        return maxWater;
    }

}
