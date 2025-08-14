// class Solution {
//     public String largestGoodInteger(String num) {
//         String max ="" ;
//         for(int i = 0 ; i < num.length()-3 ; i++){
//             String sub = num.subString(i ,i+3);
//             if(charAt(i)== charAt(i+1) &&& charAt(i+1)==charAt(i+2)){
//                if(num.compareTo(max)!= sub ||sub.compareTo()){

//                }
//             }
//         }
//     }
// }
class Solution {
    public String largestGoodInteger(String num) {
        String maxGood = "";

        for (int i = 0; i <= num.length() - 3; i++) {
            String sub = num.substring(i, i + 3);

            // Check if all three characters are same
            if (sub.charAt(0) == sub.charAt(1) && sub.charAt(1) == sub.charAt(2)) {
                if (maxGood.equals("") || sub.compareTo(maxGood) > 0) {
                    maxGood = sub;
                }
            }
        }

        return maxGood;
    }
}
