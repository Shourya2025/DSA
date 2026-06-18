class Solution {
    public String sortSentence(String s) {
        String[] ans = s.split(" ");
        String[] ans1 =  new String[ans.length];
        for(int i = 0 ; i < ans.length ; i++){
            int pos = Character.getNumericValue(ans[i].charAt(ans[i].length() -1));
            ans1[pos-1] = ans[i].substring(0 , ans[i].length()-1);
        }
        StringBuilder sm = new StringBuilder();
        for(String num : ans1){
            sm.append(num);
            sm.append(" ");
        }
        return sm.toString().trim();
    }
}