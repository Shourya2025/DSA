class Solution {
    public int len(int num){
        int cnt =0;
        while(num!=0){
            num = num/10;
            cnt++;
        }
        return cnt;
    }
    public boolean sum(int val){
        String str = String.valueOf(val);
        boolean ans = false;
        int left = 0;
        int right =0;
        for(int  i = 0 ; i < str.length() ;i++){
          
            char ch = str.charAt(i);
            if(i < str.length()/2){
                left = left + Character.getNumericValue(ch);
            }else{
                right = right + Character.getNumericValue(ch);
            }
            
        }
        return left == right;
    }
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
       while(low<=high){
        int length = len(low);
        if(length%2==0){
            boolean val = sum(low);
            if(val == true){
                ans++;
            }
        }
        low++;
       }
       return ans; 
    }
}