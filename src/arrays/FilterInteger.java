package arrays;

/*
Given an array of integers, return an array with even integers removed

ex
input = {9,4,4,3,6,2,6,4.3,3,6,6,2,3,6}
output = {9,3}
 */

public class FilterInteger {

   static void printArray(int[] arr){
        int n = arr.length;

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] removeEven(int[] demoArray){
        int oddCount = 0;

        for(int i=0;i<demoArray.length;i++){

            if(demoArray[i]%2!=0){
                oddCount++;
            }

        }

        int [] result = new int[oddCount];

        int idx =0;

        for(int i=0;i<demoArray.length;i++){

            if(demoArray[i]%2!=0){

                result[idx]=demoArray[i];

                idx++;
            }

        }

        return result;

    }

    public static void main(String[] args) {

        int [] sampleArray = {4,9,3,8,7,1,6,5}; // 9,3,7,1,5

       printArray(sampleArray);
        System.out.println();

        System.out.println("After removing even integers");

      int[] finalResult = removeEven(sampleArray);

      printArray(finalResult);

    }
}
