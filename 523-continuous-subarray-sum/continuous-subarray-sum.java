class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        Map<Integer , Integer > hm = new HashMap<>();
        int presum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            presum += nums[i];
            int rem = presum%k;
            if(rem == 0 && i>= 1){
                return true;

            }
            if(hm.containsKey(rem)){
                int idx = hm.get(rem);
                if((i - idx) >=2){
                    return true;
                }
            }
            else{
                hm.put(rem , i);
            }
        }
        return false;
    }
}






// for(int i = 0 ; i < nums.length ; i++){
//             int sum = 0 ;
//             for(int j = i ; j < nums.length ; j++){
//                 sum = sum + nums[j];
//                 if((j - i + 1) >= 2) {
//                     if(k == 0 && sum == 0){
//                         return true;
//                     }
//                     if(k != 0 && sum % k == 0){
//                         return true;
//                     }
//                 }
//             }
//         }
//         return false;








//Map<Integer , Integer> remainderIdx = new HashMap<>();
        // int sum = 0 ;
        // remainderIdx.put(0 , -1);
        // for(int i = 1 ;i < nums.length ; i++){
        //     sum += nums[i];
        //     int remainder = sum%k ;
        //     if(remainderIdx.containsKey(remainder)){
        //         if(i - remainderIdx.get(remainder)>1){
        //             return true;
        //         }
        //         else{
        //             remainderIdx.put(remainder , i);
        //         }
        //     }
        // }
        // return false;