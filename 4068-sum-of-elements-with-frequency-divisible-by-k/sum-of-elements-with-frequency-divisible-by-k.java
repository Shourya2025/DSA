class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> hm= new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i] , hm.get(nums[i])+1);
            }else{
                hm.put(nums[i] , 1);
            }
        }
        int cnt = 0;
        for(int num : hm.keySet()){
            if(hm.get(num) % k == 0){
                cnt+= num*hm.get(num);
            }
        }
        return cnt;
    }
}