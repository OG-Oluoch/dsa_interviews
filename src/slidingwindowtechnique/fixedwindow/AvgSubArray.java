package slidingwindowtechnique.fixedwindow;

/*
 Given an integer array nums consisting of n elements and integer k
 , find a contiguous subarray whose length is equal to k that has the maximum
 average value

 ex1:

 input: nums = [1,12,-5,-6,50,3], k = 4
 output: 12.75000
 explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75

 */

public class AvgSubArray {

    public static void main(String[] args) {

        int[] arrs = {1,12,-5,-6,50,3};
        int k = 4;

        double result = findMaxAvg(arrs,k);

//        System.out.println(Integer.MIN_VALUE);

        System.out.println(result);

    }

    // this approach has a time complexity of 0(n*k)
    static double bruteAvgSubArray(int[] sampleArray, int k){

        int n = sampleArray.length; // Get the length of the input array
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer value

        // Iterate through the array, stopping at n-k to avoid out-of-bounds access
        for(int i=0; i<=n-k; i++){ // Loop from the start of the array to the point where a subarray of length k can still be formed
            int sum =0; // Initialize sum for the current subarray

            for(int j = i; j<i+k; j++){ // Loop through the next k elements to calculate the sum of the current subarray
                sum += sampleArray[j]; // Add the current element to the sum

            }
            // update maxSum if the current sum is greater than the previously recorded maxSum
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum/k;

    }


     // this approach has a time complexity of 0(n)
    static double maxAvgSubArray(int [] sampleArray, int k){

        int n = sampleArray.length;

        // calculate the sum of the first k elements
        int sum = 0;
        for(int i=0; i<k; i++){
            sum = sum + sampleArray[i];

        }

        //initialize maxSum as the sum of the first window
        int maxSum = sum;

        // slide the window across the array
        for(int i=k; i<n; i++){
            sum -= sampleArray[i]; // remove element leaving the window
            sum += sampleArray[i-k]; // add new element entering the window
            maxSum = Math.max(maxSum, sum); // update maxSum

        }

        //return max average
        return (double)maxSum/k;

    }

    static double findMaxAvg(int[] sampleArray, int k){

        int m = sampleArray.length;
        int maxSum = 0; 
        int currentSum = 0;

        for(int i=0;i<k;i++){

            currentSum = currentSum + sampleArray[i];

        }

         maxSum = currentSum;

        for(int i=k;i<m;i++){

            currentSum = currentSum - sampleArray[i-k]+ sampleArray[i];

            if(currentSum>maxSum){

                maxSum = currentSum;

            }
            
        }

        return (double) maxSum/k;


    }


}
