package slidingwindowtechnique.dynamicwindow;

import java.util.HashSet;
import java.util.Set;

/*
    Given a string s, find the length of the longest substring without repeating characters.

    ex1:
    input: s = "abcabcbb"
    output: 3
    explanation: The answer is "abc", with the length of 3.

 */

public class LongestSubstring {

    public static void main(String[] args) {

        String s = "abcabcdebb";

        int result = brute(s);

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

}
