import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        ArrayList<Integer> res=new ArrayList(2);
        int votes1=0,votes2=0;
        int ele1=0,ele2=0;
        for(int i=0;i<arr.size();i++){
            if(votes1==0 && arr.get(i)!=ele2){
                votes1=1;
                ele1=arr.get(i);
            }
            else if(votes2==0 && arr.get(i)!=ele1){
                votes2=1;
                ele2=arr.get(i);
            }
            else if(arr.get(i)==ele1){
                votes1++;
            }
            else if(arr.get(i)==ele2){
                votes2++;
            }
            else{
                votes1--;
                votes2--;
            }
        }
        int count1=0,count2=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==ele1){
                count1++;
            }
            else if(arr.get(i)==ele2){
                count2++;
            }
        }
        int min=arr.size()/3;
        if(count1>min) res.add(ele1);
        if(count2>min) res.add(ele2);
        return res;
    }
}