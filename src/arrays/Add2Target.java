/*
leetcode 1

find two numbers such that they add up to a specific target number
Input: numbers = [2,7,11,15] target = 9
Output: [1,2]


*/
public class Add2Target{
public static void main(String[] args){

int[] nums ={4,7,11,15};

int target = 18;

int[] result = returnArr(nums,target);

for(int x : result){

    System.out.println(x);
}

}


//brute force approach
static int[] returnArr(int [] sampleArray, int target){

 for(int i=0;i<sampleArray.length;i++){

for(int j=i+1;j<sampleArray.length;j++){

 if(sampleArray[i]+sampleArray[j]==target){

return new int[]{i,j};

}

}

}

 throw new IllegalArgumentException("No match found");

//return new int[]{-1,-1};



}

//optimized approach


}



