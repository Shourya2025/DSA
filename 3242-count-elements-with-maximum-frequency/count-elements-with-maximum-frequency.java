class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i] , hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i] , 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int num : hm.values()){
            max = Math.max(max , num);
        }

       int total = 0;
        for (int freq : hm.values()) {
            if (freq == max) {
                total += freq;
            }
        }

        return total;

    }
}