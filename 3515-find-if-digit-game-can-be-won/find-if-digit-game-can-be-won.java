class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0;
        int dou = 0;
        int sum1 = 0 ;
        int sum2 = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int x = digits(nums[i]);
            if(x==1){
                sum1 = sum1+ nums[i];
            }else if(x==2){
                sum2 = sum2 + nums[i];
            }
        }
        return sum1>sum2 || sum2>sum1;

    }
    public int digits(int no){
        
        int cnt = 0 ;
        while(no!=0){
            cnt++;
            no= no/10;

        }
        return cnt ;
    }
}