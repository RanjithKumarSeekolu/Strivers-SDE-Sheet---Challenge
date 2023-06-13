import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a.start));
        List<Interval> res=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(res.isEmpty() || intervals[i].start>res.get(res.size()-1).finish){
                res.add(intervals[i]);
            }
            else{
                res.get(res.size()-1).finish=Math.max(res.get(res.size()-1).finish,intervals[i].finish);
            }
        }
        return res;
    }
}
