class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hm1 = new HashSet<>();
        HashSet<Integer> hm2 = new HashSet<>();
        for(int i = 0 ; i < nums1.length ;i++){
            hm1.add(nums1[i]);
        }
        for (int num : nums2) {
            if (hm1.contains(num)) {
                hm2.add(num);
            }
        }
        int[] ans = new int[hm2.size()];
        int i = 0;
        for(int num : hm2){
            ans[i++] =num;
        }
        return ans ;

    }
}