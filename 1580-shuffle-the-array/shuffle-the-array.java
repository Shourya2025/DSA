class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int k = 0 ;
        int l = n;
        int i = 0 ;
        while(l< nums.length){
            if(i%2==0){
                ans[i++] = nums[k++];
            }
            else {
                ans[i++] = nums[l++];
            }
        }
       return ans;
    }
}