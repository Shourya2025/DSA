class Solution {
    public int removeDuplicates(int[] nums) {
    int j = 1;
    int n = nums.length ;
    for(int i = 1 ; i < n ; i++){
        if(nums[i] != nums[j-1]){
            nums[j] = nums[i];
            j++;
        }
    }
    return j ;
    }
}


  //HashSet<Integer> hm = new HashSet<>();
    //     int i = 0 ; int j = 1;
    //     while(i < nums.length  && j< nums.length){
    //         if(nums[i] == nums[j]){
    //             j++;
    //         }
    //         else if(nums[i]!=nums[j]){
    //             i++;
    //             swap(nums , i , j);
    //         }
    //     }
    //     return i+1;
        
    // }
    // void swap(int[] nums , int i , int j){
    //        int temp = nums[i];
    //        nums[i] = nums[j] ;
    //        nums[j] =temp;