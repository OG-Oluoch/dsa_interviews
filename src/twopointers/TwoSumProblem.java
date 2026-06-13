package twopointers;

/*
Given an array that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
the function should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

ex.1
input: num = [2,7,11,15], target = 9

output:[1,2]

explanation: the sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2. We return [1,2].
 */

import java.util.Arrays;

public class TwoSumProblem {

    public static void main(String[] args){

        int [] arrs1 = {3,5,6,9,14,18,23};

        int target = 25;

        int [] result = twoSum(arrs1,target);

        if(Arrays.equals(result,new int[]{-1,-1})) {

                System.out.println("No solution found");

        }
        else {
            for (int x : result) {

                System.out.println(x
                );

            }
        }

    }
   //brute-force approach with a time complexity of O(n^2) and space complexity of O(1)
    static int[] bruteTwoSum(int[] sampleArr, int target){

       for(int i=0;i<sampleArr.length;i++){
           for(int j=i+1; j<sampleArr.length;j++ ){
               if(sampleArr[i]+sampleArr[j]==target){

                   return new int[]{i,j};
               }

           }
       }

       return new int[]{-1,-1};

    }

    // optimized approach using two pointers with a time complexity of O(n) and space complexity of O(1)
    static int[] twoSum(int[] sampleArr1, int target){
        int l = 0; // pointer for the left element
        int r = sampleArr1.length-1; // pointer for the right element

        while(l<r){

            int sum = sampleArr1[l] + sampleArr1[r]; // calculate sum of the two elements
            if(sum==target){
                return new int[]{l,r}; // return the indices of the two elements (1-based index)
            }else if(sum<=target){
                l++; //move the left pointer to the right to increase the sum

            }
            else {
                r--; // move the right pointer to the left to decrease the sum
            }

        }

        return new int[]{-1,-1}; // return -1 if no solution is found

    }

    static int[] findSum(int[]arr, int target){

 
        int l = 0;
        int r = arr.length-1;

        while(l<r){

            int sum = arr[l]+arr[r];

            if(sum==target){
                return new int[]{l+1,r+1};
            }
            else if(sum<target){
                l++;
            }
            else {
                r--;
            }

        }

        return new int[2];

    }


}
