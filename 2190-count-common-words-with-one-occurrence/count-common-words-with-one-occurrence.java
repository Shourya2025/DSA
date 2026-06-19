// class Solution {
//     public int countWords(String[] words1, String[] words2) {
//       Set<String> st1 = new HashSet<>();
//       Set<String> st2 = new HashSet<>();
//       for(String num1 : words1){
//         if(!st1.contains(num1)){
//             st1.add(num1);
//         }else{
//             st1.remove(num1);
//         }
//       }
//       for(String num2 : words2){
//         if(!st2.contains(num2)){
//             st2.add(num2);
//         }else{
//             st2.remove(num2);
//         }
//       }
//       Map<String , Integer> hm = new HashMap<>();
//       for(String str1 : st1){
//         // if(hm.containsKey(str1)){
//         //     hm.put(str1 , hm.get(str1) +1);
//         // }else{
//             hm.put(str1 , 1);
//         //}
//       }
//       for(String str2 : st2){
//         if(hm.containsKey(str2)){
//             hm.put(str2 , hm.get(str2) +1);
//         }else{
//             hm.put(str2 , 1);
//         }
//       }
//       int cnt = 0;
//       for(String num : hm.keySet()){
//         if(hm.get(num) == 2){
//             cnt++;
//         }
//       }
//       return cnt;

//     }
// }

class Solution {
    public int countWords(String[] words1, String[] words2) {

        Set<String> st1 = new HashSet<>();
        Set<String> dup1 = new HashSet<>();

        Set<String> st2 = new HashSet<>();
        Set<String> dup2 = new HashSet<>();

        for (String num1 : words1) {
            if (!st1.contains(num1) && !dup1.contains(num1)) {
                st1.add(num1);
            } else {
                st1.remove(num1);
                dup1.add(num1);
            }
        }

        for (String num2 : words2) {
            if (!st2.contains(num2) && !dup2.contains(num2)) {
                st2.add(num2);
            } else {
                st2.remove(num2);
                dup2.add(num2);
            }
        }

        Map<String, Integer> hm = new HashMap<>();

        for (String str1 : st1) {
            hm.put(str1, 1);
        }

        for (String str2 : st2) {
            if (hm.containsKey(str2)) {
                hm.put(str2, hm.get(str2) + 1);
            } else {
                hm.put(str2, 1);
            }
        }

        int cnt = 0;

        for (String num : hm.keySet()) {
            if (hm.get(num) == 2) {
                cnt++;
            }
        }

        return cnt;
    }
}