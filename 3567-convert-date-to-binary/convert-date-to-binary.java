class Solution {
    public String convertDateToBinary(String date) {
      String[] ans = date.split("-");  
      for(int i = 0 ; i < ans.length ;i++){
        ans[i] = Integer.toBinaryString(Integer.parseInt(ans[i]));
      }
      StringBuilder sm = new StringBuilder();
      for(int j = 0 ; j < ans.length ;j++){
        sm.append(ans[j]+"-");
      }
       sm.deleteCharAt(sm.length() - 1);
      return sm.toString();
    }
}