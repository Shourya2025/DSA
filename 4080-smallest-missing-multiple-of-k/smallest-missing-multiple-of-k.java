class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        for(int  i = 0 ; i < nums.length ;i++){
            if(!st.contains(nums[i])){
                st.add(nums[i]);
            }
        }
        int ans = k;
        int j =1;
        while(true){
            int n = j*k;
            if(!st.contains(n)){
                ans = n;
                break;
            }
            j++;
        }
        return ans;
    }
}