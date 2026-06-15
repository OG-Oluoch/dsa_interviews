package slidingwindowtechnique.dynamicwindow;

import java.util.HashSet;
import java.util.Set;

/*
   leetcode 3: Longest Substring Without Repeating Characters

    Given a string s, find the length of the longest substring without repeating characters.

    ex1:
    input: s = "abcabcbb"
    output: 3
    explanation: The answer is "abc", with the length of 3.

    

 */

public class LongestSubstring {

    public static void main(String[] args) {

        String s = "abcabcdebb";

        int result = longestSubstring(s);

        System.out.println(result);

    }

    static int brute(String s){

        int n = s.length();

        int maxLength = 0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){

                if(allUnique(s,i,j)){
                    maxLength = Math.max(maxLength, j-i);
                }
            }
        }

        return maxLength;
    }

    static boolean allUnique(String s, int start, int end){

        Set<Character> charSet = new HashSet<>();

        for(int i=start;i<end;i++){
            char c = s.charAt(i);
            if(charSet.contains(c)){ // If the character is already in the set, it's not unique
                return false;
            }
            charSet.add(c); // Mark the character as seen
        }

        return true; // All characters in the substring are unique
     }

     static int longestSubstring(String s){

        int n = s.length();

        Set<Character> charSet = new HashSet<>();
        int maxLength = 0; // Initialize the maximum length of substring without repeating characters
         int l= 0; // Left pointer for the sliding window

         for(int r=0;r<n;r++){

            //if a duplicate character exists, shrink the window from the left
             while(charSet.contains(s.charAt(r))) // While the character at the right pointer is already in the set, we have a duplicate
                {

                charSet.remove(s.charAt(l)); // Remove the leftmost character from the set
                l++;
             }

             // Add the current character to the set and update the maximum length
             charSet.add(s.charAt(r));
             maxLength = Math.max(maxLength, r-l+1); // Update the maximum length of substring without repeating characters

         }
       
        return maxLength; // Return the length of the longest substring without repeating characters


     }

}
