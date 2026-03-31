class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int k = 0;
        for(int i = 0 ; i < nums1.length ;i++){
            int no = nums1[i];
            int idx = 0;
            for(int j = 0 ; j <  nums2.length ;j++){
                if(nums2[j] == no ){
                    idx = j;
                    break;
                    
                    
                }
            }
            int a =-1;
             for(int m = idx ; m <  nums2.length ;m++){
                if(nums2[m] > no){
                    a = nums2[m];
                    break;
                }
            }
            ans[k++] = a;


        }
        return ans ;

    }
}