class Solution {
    public int point( Set<Character> st, Character ch){
        int pt = 0;
        if(ch>= 'a' && ch <= 'z'){
            pt = 1;
        }
        else if(ch>= 'A' && ch <= 'Z'){
            pt = 2;
        }
        else if(ch>= '0' && ch <= '9'){
            pt = 3;
        }
        else {
            pt = 5;
        }
        return pt;
        

    }
    public int passwordStrength(String password) {
        int ans = 0 ;
        Set<Character> st = new HashSet<>();
        for(int i = 0 ; i < password.length() ; i++){
            char ch = password.charAt(i);
            if(!st.contains(ch)){
            ans += point(st , ch);
            st.add(ch);
            }
        }
        return ans ;

    }
}