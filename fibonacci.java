class Solution {
   
    public int fib(int n) {
        //tabulation with space optimisation
        if(n == 0){
            return n;
        }
       int a= 0,b= 1,c,i;
       for(i=2;i<=n;i++){
           c = a+b;
           a = b;
           b = c;
       }
       return b;

        //tabluation with space complexity -> O(n)
    //    int dp[] = new int[n+1];
    //    Arrays.fill(dp,-1);
    //    dp[0] = 0;
    //    dp[1] = 1;
    //    for(int i=2;i<=n;i++){
    //        dp[i] = dp[i-1] + dp[i-2]; 
    //    }
    //    return dp[n];
    }
}
