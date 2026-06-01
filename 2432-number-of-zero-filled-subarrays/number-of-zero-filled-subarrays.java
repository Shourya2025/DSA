class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0;
        long zeros = 0;
        for(int num : nums){
            if(num == 0){
                zeros++;
                cnt += zeros;
                
            }
            else{
                zeros = 0;
            }
        }
        //Time Exceed Error 
        // for(int i = 0 ; i < nums.length ;i++){
        //     for(int j = i ; j < nums.length ; j++){
        //         if(nums[i] != 0){
        //             break;
        //         }
        //         if(nums[j] != 0){
        //             break;
        //         }
        //         if(nums[j] == 0){
        //             cnt++;
        //         }
        //     }
        // }
        return cnt ;
    }
}