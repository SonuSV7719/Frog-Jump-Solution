import java.util.* ;
import java.io.*; 
import java.lang.Math;
public class Solution {
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
        int dp[] = new int[n+1];
//         for (int i = 0; i<= n; i++){
//             dp[i] = -1;
//         }
        Arrays.fill(dp, -1);
        return jump(n-1, heights, dp);
    }
    
    
    public static int jump(int i, int heights[],int dp[]){
        if (i == 0) return 0;
        if (dp[i] != -1) return dp[i];
        int right = Integer.MAX_VALUE;
        int left = jump(i-1, heights, dp) + Math.abs(heights[i] - heights[i-1]);
        if(i > 1) right = jump(i-2, heights, dp) + Math.abs(heights[i] - heights[i-2]);
        return dp[i] = Math.min(left, right);
    }

}
