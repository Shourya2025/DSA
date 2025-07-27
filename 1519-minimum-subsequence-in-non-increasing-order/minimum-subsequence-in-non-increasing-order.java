class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0 ; 
        for(int i : nums){
            sum += i;
        }
        List<Integer> ans = new ArrayList<>();
        int runningSum = 0 ;
        int i = 0 ;
        int j = nums.length -1;
        while(i <= j){
            runningSum += nums[j];
            ans.add(nums[j]);
            if(runningSum > sum - runningSum) break ;
            j--;
        }
        return ans;
    }
}