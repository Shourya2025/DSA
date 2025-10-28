class Solution {
    public String reverseVowels(String s) {
        StringBuilder sm = new StringBuilder(s);
        int start = 0 ;
        int end = s.length() -1;
        while(start < end){
            char chs = sm.charAt(start);
            char che = sm.charAt(end);
             if(chs == 'a' || chs == 'e' || chs == 'i' || chs == 'o' || chs == 'u' || chs == 'A' || chs == 'E' || chs == 'I' ||chs == 'O' || chs == 'U' ){
                if(che == 'a' || che == 'e' || che == 'i' || che == 'o' || che == 'u' || che == 'A' || che == 'E' || che == 'I' ||che == 'O' || che == 'U' ){
                    swap(sm , start , end);
                    start ++;
                    end --;
                }else{
                    end --;
                }

        }
        else {
            start++;
        }
    }
    return sm.toString(); 

    }
    public void swap(StringBuilder sm  , int first , int second){
        char temp = sm.charAt(first);
        sm.setCharAt(first ,sm.charAt(second));
        sm.setCharAt(second ,temp);
    }
}