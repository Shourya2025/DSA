class Solution {
    public String finalString(String s) {
        StringBuilder sm = new StringBuilder();
        for(int i = 0 ;i <s.length() ;i++){
            char ch = s.charAt(i);
            if(ch != 'i'){
                sm.append(ch);

            }else if(ch == 'i'){
                sm.reverse();
            }
        }
        return sm.toString();
    }
}