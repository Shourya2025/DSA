class Solution {
    public int longestBalanced(int[] nums) {
        int max = 0;
        for(int i = 0 ; i < nums.length  ;i++){
            Set<Integer> odd =  new HashSet<>();
            Set<Integer> even =  new HashSet<>();
            for(int j  =  i ; j< nums.length ;j++){
                if(nums[j]%2 ==  0){
                    if(!even.contains(nums[j])){
                        even.add(nums[j]);
                    }
                }
                else {
                    if(!odd.contains(nums[j])){
                        odd.add(nums[j]);
                    }

                }
                if(odd.size() == even.size()){
                    max = Math.max(max , Math.abs(i-j)+1);
                }
            }
        }
        return max;
    }
}