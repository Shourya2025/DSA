class Solution {
    public int cnt(int nums , int digit){
        int val =0;
        while(nums!=0){
            int n = nums%10;
            if(n == digit){
                val++;
            }
            nums = nums/10;
        }
        return val;

    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;
        for(int i = 0 ; i < nums.length ;i++){
             ans = ans +  cnt(nums[i] , digit);
        }
        return ans;
        
    }
}