class Solution {
    public int countGoodSubstrings(String s) {
      int cnt  = 0;
      for(int i = 0 ; i < s.length() ; i++){
        Set<Character> st = new HashSet<>();
        for(int j = i ; j < s.length() ;j++){
            if(Math.abs(i-j+1) > 3){
                break;
            }
            char ch = s.charAt(j);
            
            if(!st.contains(ch)){
                st.add(ch);
            }else if(st.contains(ch)){
                break;
            }
            if( j-i+1 ==3 && st.size()==3 ){
                cnt++;
                break;
            }
        }
      }
      return cnt;  
    }
}