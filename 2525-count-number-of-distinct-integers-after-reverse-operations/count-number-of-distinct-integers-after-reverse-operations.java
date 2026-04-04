class Solution {
    public int rev(int no){
        int n = 0;
        while(no!=0){
            int d = no%10;
            n = n*10 + d;
            no = no/10;  
        }
        return n;

    }
    public int countDistinctIntegers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        for(int i = 0 ; i < nums.length ;i++){
            ans.add(nums[i]);
            ans.add(rev(nums[i]));
        }
         for(int j = 0 ; j < ans.size() ;j++){
           if(!st.contains(ans.get(j))){
            st.add(ans.get(j));
           }
        }
        return st.size();

    }
}