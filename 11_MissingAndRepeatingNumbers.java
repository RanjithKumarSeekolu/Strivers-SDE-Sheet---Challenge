import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] res=new int[2];
        int[] hashArr=new int[n+1];
        for(int i=0;i<n;i++){
            hashArr[arr.get(i)]++;
        }
        for(int i=1;i<=n;i++){
            if(hashArr[i]==2){
                res[1]=i;
            }
            else if(hashArr[i]==0){
                res[0]=i;
            }
            if(res[0]!=0 && res[1]!=0){
                break;
            }
        }
        return res;
    }
}