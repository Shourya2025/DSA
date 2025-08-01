class Solution {
    public void moveZeroes(int[] nums) {
       int z =0 ;
        // int j = 0;
        int[] ans = new int[nums.length]; 
        for(int i =0 ; i < nums.length ; i++){
            if(nums[i]!= 0){
                ans[z++]= nums[i];
            }
        }
        int s =0;
        while( s < ans.length  ){
            nums[s] = ans[s];
            s++;


        }
        while(s< nums.length){ 
            nums[s++] = 0; 

        }

    }
}// n+n+n =3n ada complexity no avoid O(n)