class Solution {
    public int maxSubArray(int[] nums) {
        int currmax = nums[0];
        int max = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(currmax + nums[i]> nums[i]){
                currmax += nums[i];
                
            }
            else {
                currmax = nums[i];
            }
            if(currmax > max){
                max = currmax;
            }
        }
        return max;
    }
}