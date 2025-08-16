class Solution {
    public int maximum69Number (int num) {
        StringBuilder sm = new StringBuilder(String.valueOf(num));
        for(int i = 0 ; i < sm.length(); i++){
            char ch = sm.charAt(i);
            if(ch == '6'){
                sm.setCharAt(i , '9' );
                break;
            }
        }
        return Integer.valueOf(sm.toString());
    }
}