class Solution {
    static int[] dp;
    public int loot(int i , int[] nums){
        if(i>= nums.length )return 0;
        if(dp[i] != -1) return dp[i];
        int pick = nums[i] + loot(i+2 , nums);
        int skip = loot(i+1 , nums);
        int ans = Math.max(pick , skip);
        dp[i] = ans;
        return ans;
    } 
    public int rob(int[] nums) {
        int n = nums.length ; 
        dp = new int[n];
        Arrays.fill(dp , -1);
        return loot(0 , nums);
    }
}



// JAYA'S CODE 
// public int rob(int[] nums) {
//        return rob(nums, nums.length - 1); 
//     }
//     private int rob(int[] nums, int i) {
//     if (i < 0) {
//         return 0;
//     }
//     return Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
// }