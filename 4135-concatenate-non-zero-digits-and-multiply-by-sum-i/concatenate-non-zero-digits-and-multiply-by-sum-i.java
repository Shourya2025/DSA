class Solution {
    public long sum(int n){
        int no = 0 ;
        while(n!= 0){
            int d = n %10;
            no = no + d;
            n = n /10;
        }
        return no;
    }
    public long sumAndMultiply(int n) {
        if(n == 0){
            return 0;
        }
        String str = String.valueOf(n);
        StringBuilder sm = new StringBuilder();
        int m = n;
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch != '0'){
                sm.append(ch);
            }
        }
        long ans = Long.parseLong(sm.toString() , 10);
        return ans*sum(n);
        
    }
}