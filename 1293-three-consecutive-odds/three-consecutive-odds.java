class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int cnt = 0;
        boolean ans = false ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%2 !=0 ){
                cnt++;

            }else {
                cnt = 0;
            }

            if(cnt == 3){
                ans = true;
                break;
            }
        }
        return ans;
    }
}