class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans =  new ArrayList<>();
        int max  =  Integer.MIN_VALUE;
        for(int i = 0 ; i< candies.length ;i++ ){
            if(max<candies[i]){
                max = candies[i];
            }
        }
        for(int j = 0 ; j <candies.length ;j++  ){
            if(candies[j] + extraCandies >= max){
                ans.add(true);
            }else{
                ans.add(false);            }
        
        }
        return ans ;

        
    }
}