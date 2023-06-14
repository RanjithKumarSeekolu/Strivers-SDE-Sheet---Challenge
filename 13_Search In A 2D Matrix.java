import java.util.ArrayList;
public class Solution {
    static boolean DFS(int r,int c,ArrayList<ArrayList<Integer>> mat, int target,int n,int m){
        if(mat.get(r).get(c)==target){
            return true;
        }
        if(r+1>=0 && r+1<n && c>=0 && c<m && target>=mat.get(r+1).get(c)){
            return DFS(r+1,c,mat,target,n,m);
        }
        else if(r>=0 && r<n && c+1>=0 && c+1<m && target>=mat.get(r).get(c+1)){
            return DFS(r,c+1,mat,target,n,m);
        }
        else{
            return false;
        }
    }
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        return DFS(0,0,mat,target,mat.size(),mat.get(0).size());
    }
}
