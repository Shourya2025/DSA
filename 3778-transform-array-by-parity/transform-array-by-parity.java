class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int k = 0;
        for(int i  = 0 ; i <nums.length ;i++){
            if(nums[i] % 2 == 0){
                ans[k++] = 0;
            }
            else{
                ans[k++] = 1;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}