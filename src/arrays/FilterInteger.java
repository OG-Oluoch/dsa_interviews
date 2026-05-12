package arrays;

/*
Given an array of integers, return an array with even integers removed

ex
input = {9,4,4,3,6,2,6,4.3,3,6,6,2,3,6}
output = {9,3}
 */

public class FilterInteger {

    void printArray(int[] arr){
        int n = arr.length;

        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int [] sampleArray = {4,9,3,7,1,6,5};

        FilterInteger filterInteger = new FilterInteger();
        filterInteger.printArray(sampleArray);

    }
}
