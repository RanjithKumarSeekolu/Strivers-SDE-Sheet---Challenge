import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        Map<Integer,Integer> map = new HashMap<>();
        List<int[]> ls = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(s - arr[i])) {
                int[] pair = new int[2];
                if (s - arr[i] <= arr[i]) {
                    pair[0] = s - arr[i];
                    pair[1] = arr[i];
                } else {
                    pair[0] = arr[i];
                    pair[1] = s - arr[i];
                }
                int n=map.get(s-arr[i]);
                while(n!=0){
                    ls.add(pair);
                    n--;
                }
                
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ls.sort(Comparator.comparingInt(a -> a[0]));
        return ls;
    }
}
