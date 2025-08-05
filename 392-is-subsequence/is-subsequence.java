// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         Stack<Character> st = new Stack<>();//subsequence
//         Stack<Character> word = new Stack<>();
//         for(char i =s.length()-1 ; i >= 0 ;i++){
//             char ch = s.charAt(i);
//             st.push(ch);
//         }
//         for(char r = t.length()-1 ;r >=0 ;r++){
//             char ch = t.charAt(i);
//             word.push(ch);
//         }
//         while(st.length()!=0 && word.length()!=0){
//             if(st.peek() == word.peek()){
//                 st.pop();
//                 word.pop();

//             }
//             if(st.peek() != word.peek()){
//                 word.pop();
                
//             }
//         }
//         if(st.isEmpty()){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }
import java.util.Stack;

class Solution {
    public boolean isSubsequence(String s, String t) {
        Stack<Character> st = new Stack<>();   // stack for s
        Stack<Character> word = new Stack<>(); // stack for t

        // Push s in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            st.push(s.charAt(i));
        }

        // Push t in reverse order
        for (int i = t.length() - 1; i >= 0; i--) {
            word.push(t.charAt(i));
        }

        // Match characters
        while (!st.isEmpty() && !word.isEmpty()) {
            if (st.peek().equals(word.peek())) {
                st.pop();
                word.pop();
            } else {
                word.pop();
            }
        }

        return st.isEmpty(); // if all characters matched
    }
}
