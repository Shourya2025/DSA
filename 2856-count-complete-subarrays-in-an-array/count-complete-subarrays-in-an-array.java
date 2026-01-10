class Solution {
    public int countCompleteSubarrays(int[] nums) {
       Set<Integer>st = new HashSet<>();
       for(int m = 0 ; m < nums.length ;m++){
        if(!st.contains(nums[m])){
            st.add(nums[m]);
        }
       }
       int cnt =0 ;
       int n = st.size();
       for(int i = 0 ; i < nums.length  ; i++){
        Set<Integer> sm  = new HashSet<>();
            for(int j = i ; j <nums.length ; j++){
                if(!sm.contains(nums[j])){
                    sm.add(nums[j]);
                }
                if(sm.size() == st.size()){
                    cnt++;
                }
            }
       } 
       return cnt;
    }
}