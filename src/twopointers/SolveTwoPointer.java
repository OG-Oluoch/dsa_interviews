package twopointers;

/**
 Given an integer array nums, move all 0`s to the end of it while maintaining the relative order of the non-zeroes elements
 */



public class SolveTwoPointer {

    public static void main(String[] args) {

        int[] arrs = {4,0,6,0,9,13,0,17}; // output should be [4,6,9,13,17,0,0,0]

        //before moving zeroes
        for(int x:arrs){
            System.out.printf("%d ",x);

        }

        System.out.println();

        shiftZeroes(arrs);

    //    moveZeroes(arrs);
  // after moving zeroes
       for(int i:arrs){
           System.out.printf("%d ",i);
       }

    }

   // this two pointer approach has a time complexity of O(n) and space complexity of O(1) as we are not using any extra space to store the non-zero elements.
    public static void moveZeroes(int[] nums) {
        int left = 0; // pointer for placing non-zero elements

        // iterate through the right pointer
        for (int right = 0; right < nums.length; right++) {

            //swap elements if the right pointer finds a non-zero element
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++; // move the left pointer forward to the next position for placing the next non-zero element
            }
        }
    }


    //another similar approach
    static void shiftZeroes(int[] sampleArray){

 int l = 0;

 for(int i=0;i<sampleArray.length;i++){



    if(sampleArray[i]!=0){

    int temp = sampleArray[l];

    sampleArray[l] = sampleArray[i];

    sampleArray[i] = temp;

        l++;

 }

 }

 }
}
