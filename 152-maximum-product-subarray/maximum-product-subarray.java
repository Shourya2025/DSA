class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length ; i++) {
            int pro = nums[i] ;
            max = Math.max(max, pro);
            for(int j = i+1 ; j <nums.length ; j++){
                pro = pro*nums[j];
                max = Math.max(pro , max);
            }
        }
        return max ;
    }
}
































// ArrayList<Integer> ans = new ArrayList<>();
//         for(int i = 0 ; i < nums.length ; i++){
//             int currmax = i;//Intger.MIN_VALUE;
//             ans.add(i);
//             for(int j = i+1 ; j< nums.length ;j++){
//                 if(currmax*j > currmax){
//                     currmax = currmax*j;
//                     ans.add(j);
//                 }

//             }
//         }