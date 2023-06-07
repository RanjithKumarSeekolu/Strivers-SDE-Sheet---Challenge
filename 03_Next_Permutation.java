import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		if(permutation.size()==1) return permutation;
		int i=permutation.size()-2;
		while(i>=0 && permutation.get(i)>=permutation.get(i+1)) i--;
		if(i>=0){
			int j=permutation.size()-1;
			while(permutation.get(i)>=permutation.get(j)) j--;
			Collections.swap(permutation,i,j);
		}
		Collections.reverse(permutation.subList(i+1, permutation.size()-1+1));
		return permutation;
	}
}
