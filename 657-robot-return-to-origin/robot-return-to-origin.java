class Solution {
    public boolean judgeCircle(String moves) {
        int[][] ans =  new int[2][2];
        int i =0 ; 
        int r =0;
        int c= 0;
        while(i<moves.length()){
            char ch = moves.charAt(i);
            if(ch == 'R'){
                c++;
            }else if(ch == 'L'){
                c--;
            }else if(ch == 'U'){
                r--;
            }else{
                r++;
            }
            i++;
        }
        if(c == 0 && r ==0){
            return true;
        }else{
            return false;
        }
    }
}