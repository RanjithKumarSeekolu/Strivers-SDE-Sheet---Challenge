import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long maxSum=0;
		long tempSum=0;
		for(int i=0;i<arr.length;i++){
			tempSum+=arr[i];
			maxSum=Math.max(tempSum,maxSum);
			if(tempSum<0) tempSum=0; 
		}
		return maxSum;
	}

}
