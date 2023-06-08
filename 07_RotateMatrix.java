import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int top=0,bottom=n-1,left=0,right=m-1;

        while(top<bottom && left<right) {
            // Store the first element of the next row
            int prev=mat.get(top+1).get(left);

            // Rotate the top row (left to right)
            for(int i=left;i<=right;i++) {
                int current=mat.get(top).get(i);
                mat.get(top).set(i,prev);
                prev=current;
            }
            top++;

            // Rotate the rightmost column (top to bottom)
            for (int i=top;i<=bottom;i++) {
                int current=mat.get(i).get(right);
                mat.get(i).set(right,prev);
                prev=current;
            }
            right--;

            // Rotate the bottom row (right to left)
            for (int i=right;i>=left;i--) {
                int current=mat.get(bottom).get(i);
                mat.get(bottom).set(i,prev);
                prev=current;
            }
            bottom--;

            // Rotate the leftmost column (bottom to top)
            for (int i=bottom;i>=top;i--) {
                int current=mat.get(i).get(left);
                mat.get(i).set(left,prev);
                prev=current;
            }
            left++;
        }
    }
}
