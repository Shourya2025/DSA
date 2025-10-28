class Solution {
    public String sortVowels(String s) {
        
        List<Character> ls = new ArrayList<>();
        for(int i = 0 ; i <s.length() ;i++){
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                ls.add(ch);
            }
        }
        Collections.sort(ls);
        int k = 0;
        StringBuilder sm = new StringBuilder(s);
        for(int j = 0 ; j < s.length() ;j++){
             char ch = sm.charAt(j);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                sm.setCharAt(j , ls.get(k++));
            }
        }
        return sm.toString();

    }
}