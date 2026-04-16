class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i <nums.length ;i++){
           nums[i] = sum(nums[i]);
           min = Math.min(min , nums[i]);
        }

        return min;
        
    }
    public int sum(int n){
        int sum = 0;
        while(n!=0){
            sum = sum + (n%10);
            n = n/10;
        }
        return sum ;
    }
}