class Solution {
    public int countEven(int num) {
        int i = 1 ;
        int cnt = 0 ;
        while(i<= num){
          int sum = sum(i);
          if(sum%2==0){
            cnt++;
          }
          i++;
        }
        return cnt;
    }
    public int sum(int no){
        int sum = 0;
        int d= no;
        while(no!=0){
           
            sum = sum+no%10;
            no= no/10;
        }
        return sum ;
    }
}