class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int[] ans = new int[2];
        ans[0] = searchBinary( nums,  target , true);
        ans[1] = searchBinary(nums,  target , false);
        return ans ; 

        
    }
      int searchBinary(int[] nums, int target , boolean value) {
        int start = 0 ; 
        int end = nums.length -1 ;
        int result = -1;
        while(start <= end ){
            int mid = start + (end - start)/2;
            if(target > nums[mid]){
                start = mid +1;

            }
            else if( target < nums[mid]){
                end = mid -1 ;

            }
            else if(target == nums[mid]){
                result  = mid ;
                if(value == true){ // start value
                    end = mid -1 ;
                   
                }
                 if(value == false ){ //end value
                    start = mid +1 ;
                }
            }
        }
        return result ;
    }
}