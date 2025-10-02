class Solution {
    public int maxBottlesDrunk(int filled, int exchange) {
        int ans  = 0 ;
        int empty = 0;
        while(filled >0){
            ans = ans + filled;
            empty += filled ;
            filled = 0;
            if(empty >= exchange){
                empty -= exchange ;
                filled =1   ;
            }
            exchange ++;

        }
        return ans ;
        
    }
}
