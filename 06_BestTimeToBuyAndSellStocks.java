import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int maxProfit=0;
        int buyPrice=prices.get(0);
        for(int i=0;i<prices.size();i++){
            buyPrice=Math.min(buyPrice,prices.get(i));
            maxProfit=Math.max(maxProfit,prices.get(i)-buyPrice);
        }
        return maxProfit;
    }
}