class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max  = 0;
        int i = nums1.length -1;
        int j = nums2.length -1;
        while(i>=0){
            while(j >= i){
                if(i <= j){
                    if(nums1[i] <= nums2[j]){
                        max = Math.max(max ,j -i);
                        break;
                    }
                }
                j--;
            }
            i--;
        }
        return max;
    }
}