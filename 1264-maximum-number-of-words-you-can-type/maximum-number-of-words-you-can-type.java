class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> st = new HashSet<>();
        for(int m = 0 ; m < brokenLetters.length() ; m++){
            if(!st.contains(brokenLetters.charAt(m))){
                st.add(brokenLetters.charAt(m));
            }
        }
        int cnt = 0;
        String[] ans = text.split(" ");
        for(int i = 0 ; i < ans.length ; i++){
            boolean containss = true ;
            for(int j = 0 ;  j < ans[i].length() ; j++){
                char ch = ans[i].charAt(j);
                if(st.contains(ch)){
                    containss = false;
                }
            
           
            }
            if(containss){
                cnt++;
            }
        }
        return cnt ;
    }
}