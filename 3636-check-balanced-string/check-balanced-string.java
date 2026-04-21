class Solution {
    public boolean isBalanced(String num) {
       int left = 0 ;
       int right = 0;
       for(int i = 0 ; i < num.length() ; i++){
        int no = num.charAt(i) - '0';
        if(i%2==0){
            right += no;
        }else{
            left += no;
        }
       }
       return left == right;
        
    }
}