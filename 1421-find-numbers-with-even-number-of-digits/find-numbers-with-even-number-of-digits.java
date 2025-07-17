class Solution {
    public int findNumbers(int[] nums) {
        int cnt =0 ;
        for(int i = 0 ; i < nums.length ; i++){
            
            if(isEven(nums , i) == true){
                cnt++;

            }
        }
        return cnt;
        
    }
     boolean isEven(int[] nums , int index) {
        int digits = 0;
        int n = nums[index];
        while(n!=0){
            digits++;
            n = n/10;
        }
        if(digits%2 ==0){
            return true;
        }
        else return false ;
    }
}
