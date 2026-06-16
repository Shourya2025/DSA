class Solution {
    public String processStr(String s) {
        StringBuilder sm = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch) && Character.isLowerCase(ch)){
                sm.append(ch);
            }else if(ch == '#'){
                sm.append(sm.toString());
            }else if(ch == '%'){
                sm = sm.reverse();
            }else if(ch == '*'){
               if (sm.length() > 0) {
                    sm.deleteCharAt(sm.length() - 1);
                }
            }
        }
        return sm.toString();
    }
}