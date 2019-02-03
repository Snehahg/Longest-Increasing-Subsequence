class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length==0){
            return 0;
        }
        dp[0]=1;
        int maxLen = 1;
        int  max;
        for(int i=1;i<nums.length;i++){
           max=0;
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i]){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i]=max+1;
            maxLen=Math.max(maxLen,dp[i]);
        }
       return maxLen;
    }
}
