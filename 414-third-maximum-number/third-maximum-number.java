class Solution {
    public int thirdMax(int[] nums) {
        HashMap<Integer , Integer> hm =  new HashMap<>();
        int[] ans = new int[nums.length];
        int k =0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(hm.containsKey(nums[i]) == false ){
                hm.put(nums[i] , 1);
                ans[k++]= nums[i];
            }
        }
        Arrays.sort(ans , 0 , k);
        if(k <3){
            return ans[k -1];
        }
       
        else  {
            return ans[k - 3];
        }
    
}}