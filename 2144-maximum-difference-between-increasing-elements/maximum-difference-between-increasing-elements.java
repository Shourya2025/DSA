class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;
        for(int i =0 ; i < nums.length ;i++){
            int curr = 0 ;
           for(int j = i ; j < nums.length ; j++){
            if(nums[j]>nums[i]){
                curr = nums[j] - nums[i];
                max = Math.max(curr , max);
            }
           }
        }
        return max;

    }
}