class Solution {
    public int maxSubArray(int[] nums) {
       /* int currsum = nums[0];
        int max = nums[0];
        for(int i =1 ; i<nums.length ; i++){
            if(currsum + nums[i] > nums[i]){
                currsum = currsum + nums[i];
            }
            else {
                currsum = nums[i];
            }
            max = Math.max( max,currsum  );
            
        }
        return max ;*/




        //Old Approach 
        // int max = nums[0];
        // int currmax = nums[0];
        // for(int i = 1 ; i < nums.length ; i++){
        //     if(currmax + nums[i]> nums[i]){
        //         currmax = currmax + nums[i];

        //     }
        //     else 
        //     {
        //         currmax = nums[i];

        //     }
        //     max = Math.max(currmax, max);
        // }
        // return max;



        //Kadane's Algorthim 
        int max = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            currsum += nums[i];
            max = Math.max(currsum , max);
            if(currsum < 0){
                currsum = 0;
            }
        }
        return  max;




    }
}