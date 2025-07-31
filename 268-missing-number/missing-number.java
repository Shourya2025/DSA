class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);

        // int n = nums.length-1;
        // for(int i = 0 ; i <=n ; i++){
        //     if(nums[i] != i ){
        //         return i ;
        //     }
        // } 
        // return nums.length; 
        return sort(nums);
        
    }
    int sort(int[] nums){
        int i = 0 ;
        while(i < nums.length){
            int correct = nums[i];// correct indx
           if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums , i , correct);

            }
            else {
                i++;

            }
        }
        // Searching
        for(int s = 0 ; s< nums.length ;s++ ){
            if(nums[s] != s){
                return s ;

            }
        }
        return nums.length;



    }
    void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}