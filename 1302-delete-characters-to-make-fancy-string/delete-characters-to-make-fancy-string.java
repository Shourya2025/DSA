class Solution {
    public String makeFancyString(String s) {
    StringBuilder sm = new StringBuilder(s);
    int cnt = 1 ;
    for(int i = 0 ; i < sm.length(); i++){
    char ch = sm.charAt(i);
    if(i > 0 && ch == sm.charAt(i-1)){
        cnt++;
    }
    if(i > 0 && ch != sm.charAt(i-1)){
        cnt = 1;
    }
    if(cnt == 3){
        
        sm.deleteCharAt(i);
        i--;
        cnt--;
    }

    }
    return sm.toString();

    }
}