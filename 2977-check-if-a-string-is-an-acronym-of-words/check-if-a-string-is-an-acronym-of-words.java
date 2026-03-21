class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sm = new StringBuilder();
        for(int i = 0 ; i < words.size() ;i++){
            char ch = words.get(i).charAt(0);
            sm.append(ch);
        }
        if(sm.toString().equals(s)){
            return true;
        }
        else{
            return false ;
        }
    }
}