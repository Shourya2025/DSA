class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0 ;
       List<Integer> ans = new ArrayList<>();
        for(int i : nums){
            sum = sum + i ;
        }
        int i = 0;
        int j = nums.length -1 ; 
        int runningSum = 0 ; 
        while(i<=j){
            runningSum += nums[j];
            ans.add(nums[j]);
            if(runningSum > sum - runningSum) break;
            j -- ;

           
        }
        return ans;
    }
}