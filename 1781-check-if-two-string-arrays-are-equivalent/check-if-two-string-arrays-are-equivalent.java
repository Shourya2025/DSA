class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sm1 = new StringBuilder();
        StringBuilder sm2 = new StringBuilder();
        // for(int i = 0 ; i < word1.length ; i++){
        //     char ch1 = word1.charAt(i);
        //     sm1.append(ch1);
        // }

        // for(int j = 0 ; j < word2.length ; j++){
        //     char ch2 = word2.charAt(j);
        //     sm2.append(ch2);
        // }

        // if(sm1.size() != sm2.size()){
        //     return false ;
        // }

        // for(int x = 0 ; x < sm1.size() ;x++){
        //     char ch3 = sm1.charAt(x);
        //     char ch4 = sm2.charAt(x);
        //     if(ch3 != ch4){
        //         return false ;
        //     }
        // }
        // return true ;


         for (String s : word1) {
            sm1.append(s);
        }

        for (String s : word2) {
            sm2.append(s);
        }

        return sm1.toString().equals(sm2.toString());

    }
}