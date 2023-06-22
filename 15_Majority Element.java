import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		int candidate=-1,votes=0;
		for(int i=0;i<arr.length;i++){
			if(votes==0){
				candidate=arr[i];
				votes++;
			}
			else if(arr[i]==candidate){
				votes++;
			}
			else{
				votes--;
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==candidate){
				count++;
			}
		}
		return count>(arr.length/2)?candidate:-1;
	}
}