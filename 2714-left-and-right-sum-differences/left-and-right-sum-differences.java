class Solution {
    public int[] leftRightDifference(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        int lefti = 0;
        int righti = 0;

        for(int i = 0; i < nums.length; i++){
            left[i] = lefti;
            lefti += nums[i];
        }

        for(int j = nums.length - 1; j >= 0; j--){
            right[j] = righti;
            righti += nums[j];
        }

        int[] ans = new int[nums.length];

        for(int z = 0; z < ans.length; z++){
            ans[z] = Math.abs(left[z] - right[z]);
        }

        return ans;
    }
}