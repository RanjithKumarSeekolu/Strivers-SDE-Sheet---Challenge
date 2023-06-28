import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
	int n=arr.size();
        int xr=0;
        Map<Integer,Integer> mpp=new HashMap<>();
        mpp.put(xr,1);
        int cnt=0;
        for (int i=0;i<n;i++) {
            xr=xr^arr.get(i);
            int val = xr ^ x;

            if (mpp.containsKey(val)) {
                cnt+=mpp.get(val);
            }

            if (mpp.containsKey(xr)) {
                mpp.put(xr,mpp.get(xr)+1);
            } else {
                mpp.put(xr,1);
            }
        }
        return cnt;
	}
}