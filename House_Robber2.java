class Solution {
    public int houseRob(int[] nums){
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;
        for(int i=1;i<n;i++){
            int take = nums[i];
            if(i>1){
                take = take+prev2;
            }
            int nontake = 0 + prev;
            int curr = Math.max(take,nontake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public int rob(int[] nums) {
        int n = nums.length;
       int temp1[] = Arrays.copyOfRange(nums,1,n);
       int temp2[] = Arrays.copyOfRange(nums,0,n-1);
        if(n == 1){
            return nums[0];
        }
        // for(int i=1;i<n;i++){
        //     if(i != 0){
        //         temp1.add(nums[i]);
        //     }
        //     if(i != n-1){
        //         temp2.add(nums[i]);
        //     }
        // }
        return Math.max(houseRob(temp1), houseRob(temp2));
    }
}

//   int ar[]=Arrays.copyOfRange(arr,1,n);

//         int br[]=Arrays.copyOfRange(arr,0,n-1);
