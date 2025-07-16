class Solution {
    public void moveZeroes(int[] nums) {
    // This is not apporiate approach
    //   int[] arr = new int[nums.length];
    //   for(int i = 0 , j=0; i< nums.length ;i++ ){
    //     if(nums[i] !=0){
    //         arr[j] = nums[i];
    //         j++;
    //     }
    //   }
    //    for(int i = 0 ; i< nums.length ;i++ ){
    //     nums[i] = arr[i];
    //    }
    //Optimal approach is coppying non zero values only and all will automatically reach at the end
    int j = 0;
     for(int i = 0; i< nums.length ;i++ ){
        if(nums[i] !=0){
            nums[j]= nums[i];
            j++;
          
        }
      }
      while(j < nums.length ){
        nums[j] =0 ;
        j++;
      }

      
    }
}