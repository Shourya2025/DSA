class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            int sum = 0 ;
            for(int j =i ;j < nums.length ; j++){
                // if(i!=j){if(nums[i]+ nums[j] == k){
                //     cnt++;
                // }}
                sum += nums[j];
                if(sum == k){
                    cnt++;
                }
            }
        }
        return cnt;

    }
}