class Solution {
    public int differenceOfSums(int n, int m) {
      int i = 1;
      int yes = 0;
      int no = 0;
      while(i <= n){
        if(i % m == 0){
                yes = yes + i;
        }else{
            no = no +i;
        }
        i++;
      }
      return  no-yes;  
    }
}