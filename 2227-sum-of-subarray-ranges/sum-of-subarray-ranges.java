class Solution {
    public long subArrayRanges(int[] nums) {
        long sum = 0;
        int n = nums.length ;
        for(int i = 0 ; i < n ; i++){
            int min = nums[i];
            int max = nums[i];
            for(int j = i ; j< n ;j++){
                max = Math.max(max , nums[j]);
                min = Math.min(min , nums[j]);
                sum =  sum +(max - min);
            }
        }
        return sum;
    }
}