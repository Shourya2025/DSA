class Solution {
    public int sumOfSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int k = 0;
        for(int i = 0  ; i < nums.length ;i++){
            if(nums.length % (i+1) ==0){
                ans[k++] = nums[i];
            }

        }
        int sum  = 0;
        for(int j = 0 ; j < k ;j++){
            sum  +=  ans[j]*ans[j];
        }
        return sum;
    }
}