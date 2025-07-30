class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int i = 0 ; 
        int j = 0;
        int z = 0;

        while(i <m && j <n){
            if(nums1[i]<= nums2[j]){
                ans[z++] = nums1[i++];
                
            }
            else if(nums1[i] >= nums2[j]){
                ans[z++] = nums2[j++];
               
            }
        }
        while (i < m) {
            ans[z++] = nums1[i++];
        }

        while (j < n) {
            ans[z++] = nums2[j++];
        }
        for(int s= 0 ; s< ans.length ; s++){
            nums1[s] = ans[s];

        }
      
    }
}