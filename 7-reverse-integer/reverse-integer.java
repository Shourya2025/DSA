class Solution {
    public int reverse(int x) {
        long rev = 0;
        long r;
        while(x!=0){
            r = x%10;
            rev = rev*10+ r;
            x = x/10;

        
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev ;

        
    }
}