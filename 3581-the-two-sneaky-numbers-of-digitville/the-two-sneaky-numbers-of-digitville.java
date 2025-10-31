class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        int[] ans = new int[2];
        int k = 0;
        for(int i = 0 ; i< nums.length ;i++){
            if(hm.contains(nums[i])){
                ans[k++] = nums[i];
                if(k == 2){
                    return ans ;
                }
            }else{
                hm.add(nums[i]);
            }
        }
        return ans ;
    }
}