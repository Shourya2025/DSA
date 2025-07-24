class Solution {
    public int singleNonDuplicate(int[] nums) {
        // if(nums.length ==1){
        //     return nums[0];
        // }
        // else if(nums[0] != nums[1]){
        //     return nums[0];
        // }
        // else if(nums[nums.length-1] != nums[nums.length-2] ){
        //     return nums[nums.length -1];
        // }
        // int start = 0;
        // int end = nums.length -1;
        // while(start <= end){
        //     int mid = (start + end)/2;
        //     if(nums[mid] != nums[mid-1]&& nums[mid] != nums[mid +1]){
        //         return nums[mid];

        //     }
        //     else if(mid%2 == 1 ){
        //         if(nums[mid-1] == nums[mid]){
        //             start = mid +1;
        //         }
        //         else {
        //             end = mid -1;
        //         }
        //     }
        //     else{//even index
        //         if(nums[mid]== nums[mid+1]){
        //             start = mid+1;
        //         }
        //         else {
        //             end = mid -1;
        //         }
        //     }
        // }
        // return -1;
       
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0 ; i <nums.length ; i++){
            if(hm.containsKey(nums[i]) == true){
                hm.put(nums[i] , hm.get(nums[i])+1);
            }
            else {
                hm.put(nums[i] ,1);
            }
        }
        for(int key : hm.keySet()){
            if(hm.get(key)==1){
                return key;
            }
        }
        return -1 ;
    }
}