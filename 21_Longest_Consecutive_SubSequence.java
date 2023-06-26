import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        
        if(N == 0) return 0;
        
        Arrays.sort(arr); // sorting the array in O(N log(N))
        
        int longest = 0;
        int current_longest = 1;
        
        for(int i=1;i<N;i++){
            
            if(arr[i] == arr[i-1]){
                continue; //same element as previous skip this
            }
            
            else if(arr[i] == arr[i-1] + 1){
                current_longest++; //current element is consecutive so increase it.
            }
            
            else{
                longest = Math.max(longest,current_longest);
                current_longest = 1; // we can't extend so update longest as the maximum of the both and reset the current_longest.
            }
            
        }
        
        return Math.max(longest,current_longest);
    }
}