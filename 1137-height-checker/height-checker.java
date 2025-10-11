class Solution {
    public int heightChecker(int[] heights) {
        int cnt = 0 ;
        int[] ans = new int[heights.length];
        System.arraycopy(heights ,0, ans , 0 , heights.length );
        Arrays.sort(heights);
        for(int i = 0 ; i < heights.length ; i++){
            if(heights[i] != ans[i]){
                cnt++;
            }
        }
        return cnt ;
    }
}