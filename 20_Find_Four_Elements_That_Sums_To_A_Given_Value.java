import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
    Arrays.sort(arr);
    for(int i=0;i<n;i++){
      if(i>0 && arr[i]==arr[i-1]) continue;
      for(int j=i+1;j<n;j++){
        if(j!=i+1 && arr[j]==arr[j-1]) continue;
        int k=j+1;
        int l=n-1;
        while(k<l){
          long sum=arr[i];
          sum+=arr[j];
          sum+=arr[k];
          sum+=arr[l];
          if(sum==target){
            return "Yes";
          }
          else if(sum<target){
            k++;
          }
          else{
            l--;
          }
        }
      }
    }
    return "No";
  }
}
