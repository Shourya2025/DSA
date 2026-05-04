class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> sm = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(!sm.contains(nums[i])){
                sm.add(nums[i]);
            }
        }
        boolean pre = true;
        while(pre ==  true){
            if(sm.contains(original)){
                original = 2*original;
            }
            else{
                pre = false;
            }
        }
        return original;
    }
}