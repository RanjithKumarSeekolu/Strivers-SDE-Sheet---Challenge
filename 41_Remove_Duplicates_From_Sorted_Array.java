import java.util.ArrayList;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		if(n==0 || n==1){
			return n;
		}
		int j=0;
		for(int i=0;i<n-1;i++){
			if(arr.get(i)!=arr.get(i+1)){
				arr.set(j,arr.get(i));
				j++;
			}
		}
		arr.set(j,arr.get(n-1));
		return j+1;
	}
}