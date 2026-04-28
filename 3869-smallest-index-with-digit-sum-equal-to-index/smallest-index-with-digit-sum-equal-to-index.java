class Solution {
    public int sum(int num){
        int sum = 0 ;
        while(num!=0){
            int n = num%10;
            sum = sum+n;
            num = num/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i = 0 ; i <nums.length ;i++){
            if(nums[i] >= 10){
                int res = sum(nums[i]);
                if(res == i){
                    return i;
                }
            }
            else{
                if(nums[i] == i){
                    return i;
                }
            }
        }
        return -1;
    }
}