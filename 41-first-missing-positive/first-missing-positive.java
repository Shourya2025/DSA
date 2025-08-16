// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         int i = 0;
//         while(i < nums.length && nums.length != 0){
//             int correct = nums[i]-1 ;
//             if(nums[i]!=nums[correct]){
//                 swap(i , correct , nums);
//             }
//             else{
//                 i++;
//             }
//         }
//         for(int s  = 0 ; s < nums.length ; s++){
//             int correct = nums[s]-1 ;
//             if(nums[s] != nums[correct]){
//                 return nums[s];
//               }
//         }
//         return -1;
        
//     }
//     void swap(int first , int second , int[]nums ){
//         int temp = nums[first];
//         nums[first] = nums[second];
//         nums[second]= temp ;
//     }
// }
class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            // If nums[i] is in the correct range and it's not in the right place
            if (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                swap(i, nums[i] - 1, nums);
            } else {
                i++;
            }
        }
        
        // After placing all numbers in their correct positions, the first index where
        // nums[i] is not equal to i + 1, we return i + 1.
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        
        // If all numbers from 1 to nums.length are in place, then return nums.length + 1
        return nums.length + 1;
    }
    
    void swap(int first, int second, int[] nums) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
