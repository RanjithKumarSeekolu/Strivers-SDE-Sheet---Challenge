import java.io.*;
import java.util.* ;

public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        long base = x % m;
        long result = 1;
        
        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * base) % m;
            }
            
            base = (base * base) % m;
            n /= 2;
        }
        
        return (int) result;
    }
}