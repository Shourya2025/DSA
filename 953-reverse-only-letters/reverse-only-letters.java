class Solution {
    public String reverseOnlyLetters(String s) {
        // StringBuilder sm = new StringBuilder();
        // for(int i = 0 ; i< s.length() ; i++ ){
        //     char ch = s.charAt(i) ;
        //     // if(ch != '-'){
        //         sm.append(ch);
        //     // }
        // }
        // sm.reverse();
        // StringBuilder ans = new StringBuilder();
        // for(int j = 0 ; j < s.length() ; j++){
        //     char ch =  s.charAt(j);
        //     if(ch!= '-'){
        //         ans.append(sm.charAt(j));
        //     }else if(ch == '-'){
        //         ans.append(ch);
        //     }
        // }
        // return ans.toString();

        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                st.push(ch);
            }
        }
        StringBuilder sm = new StringBuilder();
        for(int j = 0 ; j < s.length() ; j++){
            char ch = s.charAt(j);
            if(Character.isLetter(ch)){
                sm.append(st.pop());
            }else{
                sm.append(ch);
            }
        }    
        return sm.toString(); 
    }
}