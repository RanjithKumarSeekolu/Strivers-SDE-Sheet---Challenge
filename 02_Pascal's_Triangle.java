import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> res=new ArrayList<>();
		for(int i=0;i<n;i++){
			ArrayList<Long> temp=new ArrayList<>();
			if(i==0){
				temp.add(1L);
				res.add(temp);
				continue;
			}
			int N=res.get(res.size()-1).size();
			for(int j=0;j<=N;j++){
				if(j==0 || j==N){
					temp.add(1L);
				} 
				else{
					temp.add(res.get(res.size() - 1).get(j - 1) + res.get(res.size() - 1).get(j));
				}			
			}
			res.add(temp);
		}
		return res;
	}
}
