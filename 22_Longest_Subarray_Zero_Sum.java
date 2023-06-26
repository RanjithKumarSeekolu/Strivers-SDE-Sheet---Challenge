import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		int maxLength = 0;
        HashMap<Integer, Integer> prefixSums = new HashMap<>();
        int currentSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            currentSum += arr.get(i);

            if (currentSum == 0) {
                maxLength = i + 1;
            } else if (prefixSums.containsKey(currentSum)) {
                int length = i - prefixSums.get(currentSum);
                maxLength = Math.max(maxLength, length);
            } else {
                prefixSums.put(currentSum, i);
            }
        }

        return maxLength;
	}
}