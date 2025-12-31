import java.util.Stack;

class Solution {
    public int countAsterisks(String s) {
        Stack<Character> st = new Stack<>();
        int bar = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '|') {
                if (bar == 0) {
                    bar = 1;
                } else {
                    bar = 0;
                }
            } else {
                if (bar == 0) {
                    st.push(ch);
                }
            }
        }

        int cnt = 0;
        while (!st.isEmpty()) {
            char c = st.pop();
            if (c == '*') {
                cnt++;
            }
        }
        return cnt;
    }
}
