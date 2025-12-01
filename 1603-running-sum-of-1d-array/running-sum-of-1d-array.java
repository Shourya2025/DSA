class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int k =1;
        ans[0] = nums[0];
        for(int i = 1 ; i< nums.length ; i++){
            ans[k++] = nums[i]+ ans[i-1]; 
        }
        return ans;
    }
}