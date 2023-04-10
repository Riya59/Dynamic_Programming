import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int find(int ind, ArrayList<Integer>nums, int dp[]){
		if(ind == 0){
			return nums.get(ind);
		}
		if(ind < 0){
			return 0;
		}
		if(dp[ind] != -1){
			return dp[ind];
		}
		int pick = nums.get(ind) + find(ind - 2, nums, dp);
		int notpick = 0 + find(ind - 1,nums,dp);
		return dp[ind] = Math.max(pick,notpick);
	}
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		int n = nums.size();
		int dp[] = new int[n+1];
		Arrays.fill(dp,-1);
		return find(n-1,nums,dp);
	}
}
