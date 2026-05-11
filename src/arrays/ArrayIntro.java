package arrays;


import java.util.Arrays;

public class ArrayIntro {

    public void printArray(int[] arr){

        int n = arr.length;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

    }

    public static void main(String[] args) {

  ArrayIntro arrayIntro = new ArrayIntro();

  arrayIntro.printArray(new int[]{5,9,2,7});


    }
}
