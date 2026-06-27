class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        // for(int i = 0 ; i < s.length() ; i++){
        //     char ch = s.charAt(i);
        //     if(ch == '#' && !st1.isEmpty()){
        //         st1.pop();
        //     }else{
        //         st1.push(ch);
        //     }

        // }

        //   for(int j = 0 ; j < t.length() ; j++){
        //     char ch = t.charAt(j);
        //     if(ch == '#' && !st2.isEmpty()){
        //         st2.pop();
        //     }else{
        //         st2.push(ch);
        //     }

        // }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '#') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            } else {
                st1.push(ch);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (ch == '#') {
                if (!st2.isEmpty()) {
                    st2.pop();
                }
            } else {
                st2.push(ch);
            }
        }

        StringBuilder sm1 = new StringBuilder();
        StringBuilder sm2 = new StringBuilder();

        while (!st1.isEmpty()) {
            sm1.append(st1.peek());
            st1.pop();
        }
        while (!st2.isEmpty()) {
            sm2.append(st2.peek());
            st2.pop();
        }
        return sm1.toString().equals(sm2.toString());
    }
}