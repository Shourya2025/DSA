class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        int left = 0 ; 
        long currSum = 0 ; long maxSum = 0 ;
        for(int right = 0 ; right< nums.length ; right++){
            while(st.contains(nums[right])){
                currSum -= nums[left];
                st.remove(nums[left]);
                left++;
            }
            currSum += nums[right];
            st.add(nums[right]);
            if(right - left +1 == k){
                maxSum = Math.max(currSum , maxSum);
                currSum -= nums[left];
                st.remove(nums[left]);
                left++;
            }
        }
        return maxSum ;
    }
}