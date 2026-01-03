class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int cnt = 0;
        for(int i = 0 ; i < nums1.length ;i++){
            int no = nums1[i];
            for(int j =0 ; j <nums2.length ;j++){
                if(no % (nums2[j]*k) == 0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}