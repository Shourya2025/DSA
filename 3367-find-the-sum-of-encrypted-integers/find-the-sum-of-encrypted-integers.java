class Solution {
    public int digit(int no){
        if (no == 0) return 0;

        int len =0;
        int max = Integer.MIN_VALUE;
        while(no!=0){
            int d = no%10;
            if(d>=max){
                max = d;
            }
            no = no/10;
            len++;
        }
       
        int ans = 0;
           for (int i = 0; i < len; i++) {
            ans = ans * 10 + max;
        }

        return ans;


    }
    public int sumOfEncryptedInt(int[] nums) {
       int ret = 0;
       for(int i = 0 ; i < nums.length ; i++){
        ret+= digit(nums[i]);
       }
       return ret; 
    }

}