class Solution {
 public boolean Good(int num){
            boolean change = false ;
            while(num!=0){
                int digit = num%10;
                if(digit == 3 || digit == 4 || digit == 7) {return false;}
                if(digit == 2 ||digit == 6|| digit == 5 || digit == 9){change =  true;}
                num = num/10;
            }
            return change ;
   }
    public int rotatedDigits(int n) {
       
       int cnt = 0;
       for(int i = 1 ; i <= n ; i++){
        if(Good(i) == true){
            cnt++;
        }
       }
       return cnt;
        
    }
}