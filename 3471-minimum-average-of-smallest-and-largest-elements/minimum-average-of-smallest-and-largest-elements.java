class Solution {
    public double minimumAverage(int[] nums) {
        int k = nums.length / 2;
        int i =0 ;
        int j = nums.length -1 ;
        Arrays.sort(nums);
        int x = 0 ;
        double[] ans = new double[nums.length/2];
       
            while (k != 0  && i < j) {
                double no = (nums[i] + nums[j]) / 2.0;
                ans[x++] = no;
                i++;
                j--;
                k--;

            }
        Arrays.sort(ans);
        return ans[0];

    }
}