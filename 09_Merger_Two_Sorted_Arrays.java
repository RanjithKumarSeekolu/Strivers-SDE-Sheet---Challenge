import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int res[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                res[k++]=arr1[i++];
            }
            else{
                res[k++]=arr2[j++];
            }
        }
        while(i<m){
            res[k++]=arr1[i++];
        }
        while(j<n){
            res[k++]=arr2[j++];
        }
        return res;
    }
}
