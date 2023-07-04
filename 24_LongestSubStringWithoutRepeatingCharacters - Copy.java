import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		int n = input.length(), longest = 0;
        int[] nextIndex = new int[128]; 
        for (int r=0, l=0; r<n; r++) {
            l = Math.max(nextIndex[input.charAt(r)], l); 
            longest = Math.max(longest, r - l + 1);
            nextIndex[input.charAt(r)] = r + 1;
        }
        return longest;
	}
}
