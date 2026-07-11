class Solution {
    public String greatestLetter(String s) {
     boolean[] lower = new boolean[26];
boolean[] upper = new boolean[26];
      for(int i = 0 ; i < s.length() ; i++){
        char ch = s.charAt(i);
        if(Character.isUpperCase(ch)){
           upper[ch - 'A'] = true;
        }else{
             lower[ch-'a'] = true;

        }
      }
      String ans = "";
      int k = 25; 
      while(k>=0){
        if(lower[k] == true && upper[k] == true){
            
            ans = Character.toString((char)('A' + k));
            break ;
        }
        k--;
      }
      return ans; 
    }
}