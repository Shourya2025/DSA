class Solution {
    public boolean isHappy(int n) {
      HashSet<Integer> hm = new HashSet<>();
      while(n!=1){
        if(hm.contains(n)) return false ;
        hm.add(n);
        n = square(n);
      }
      return true ;  
    } 
    int square(int n){
        int sum = 0 ;
        while(n!=0){
            int d = n%10;
            sum += d*d;
            n = n/10;

        }
        return sum;
    }
}