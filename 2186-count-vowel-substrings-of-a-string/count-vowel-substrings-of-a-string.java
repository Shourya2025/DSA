class Solution {
    public int countVowelSubstrings(String word) {
      int cnt = 0;
      for(int  i = 0 ; i < word.length() ; i++){
        Set<Character> st = new HashSet<>();
        for(int j = i  ; j < word.length() ; j++){
            char ch = word.charAt(j);
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' ){
                if(!st.contains(ch)){
                    st.add(ch);
                }
                if(st.size() == 5){
                    cnt++;
                }
            }else{
                break;
            }
        }
      }
      return cnt;
    }
}