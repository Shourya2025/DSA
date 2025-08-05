class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length];
        int p =0;
        int[] neg = new int[nums.length];
        int n = 0 ;
        int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length ;i++){
            if(nums[i]>= 0){
                pos[p++] = nums[i];
            }
            else if(nums[i]< 0){
                neg[n++] = nums[i];
            }
        }
        int positive = 1;
        int negative = 0;
        int index = 1;
        ans[0] = pos[0];
        for(int s = 1 ; s <ans.length ;s++){
            if(s%2==0){
                ans[index++] = pos[positive++];
            }
            else{
                ans[index++] = neg[negative++];
            }
        }
        return ans;
    }
}