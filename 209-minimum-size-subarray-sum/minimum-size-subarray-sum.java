class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // Sliding Window
        int left = 0;
        int currSum = 0;
        int minLen = Integer.MAX_VALUE;
        for(int right = 0 ; right < nums.length ; right++){
            currSum += nums[right];
            while(currSum >= target){
               if(right - left +1 < minLen){
                minLen = right - left + 1;
               }
               currSum -= nums[left];
               left++;
            }

        }  
        if(minLen<Integer.MAX_VALUE){
            return minLen;
        }     
        else {
            return 0;
        }
        
    }
}