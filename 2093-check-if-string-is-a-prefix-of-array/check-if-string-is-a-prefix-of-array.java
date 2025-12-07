// class Solution {
//     public boolean isPrefixString(String s, String[] words) {
//         StringBuilder sm = new StringBuilder();
//         for(String word : words){
//             sm.append(word);
//             if (sm.length() >= s.length()) {
//                 break;
//             }
//         }
//         return sm.toString().startsWith(s);
//     }
// }
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            sb.append(w);

            if (sb.length() == s.length()) {
                return sb.toString().equals(s);
            }
            if (sb.length() > s.length()) {
                return false;
            }
        }

        return false;
    }
}
