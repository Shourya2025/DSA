// class Solution {
//     public String longestPalindrome(String s) {
//     //             String longest = "";

//         for (int i = 0; i < s.length(); i++) {
//             for (int j = i + 1; j <= s.length(); j++) {
//                 String sub = s.substring(i, j);
//                 if (isPalindrome(sub) && sub.length() > longest.length()) {
//                     longest = sub;
//                 }
//             }
//         }

//         return longest;
//     }

//     boolean isPalindrome(String part){
//         int i = 0 ;
//         int j = part.length()-1;
//         while(i<=j){
//             char ch1 = part.charAt(i);
//             char ch2 = part.charAt(j);
            
//             if(ch1.equals(ch2)){
//                 i++;
//                 j--;
                
//             }
//             else {
//                 return false ;
//             }
            
//         } 
//         return true;       
//     }
// }
class Solution {
    public String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        return longest;
    }

    boolean isPalindrome(String part) {
        int i = 0;
        int j = part.length() - 1;

        while (i <= j) {
            char ch1 = part.charAt(i);
            char ch2 = part.charAt(j);

            if (ch1 == ch2) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }
}
