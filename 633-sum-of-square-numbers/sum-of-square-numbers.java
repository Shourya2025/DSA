class Solution {
    public boolean judgeSquareSum(int c) {
        int i = 0; 
        int j =  (int)Math.sqrt(c);
        if(c == 2 ){
            return true;
        }
        while(i <= j){
            long sum = (long)i*i + (long)j*j;
            if(sum == c){
                return true;
            }
            else if(sum >c){
                j--;
            }
            else if(sum <c){
                i++;
            }
        }
        return false;
    }
}