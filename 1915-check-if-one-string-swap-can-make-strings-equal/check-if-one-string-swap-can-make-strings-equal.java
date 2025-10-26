class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character , Integer> hm1 = new HashMap<>();
        HashMap<Character , Integer> hm2 = new HashMap<>();
       // Put
        
        for(int j = 0 ; j <s2.length() ;j++){
            char ch1 = s1.charAt(j);
            if(hm1.containsKey(ch1)){
                hm1.put(ch1 , hm1.get(ch1)+1);
            }
            else {
                hm1.put(ch1 , 1);
            }
            char ch2 = s2.charAt(j);
            if(hm2.containsKey(ch2)){
                hm2.put(ch2 , hm2.get(ch2)+1);
            }
            else {
                hm2.put(ch2 , 1);
            }
        }
        //Basic check
        int cnt = 0;
        for(int i = 0 ; i <s2.length() ;i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1 != ch2){
                cnt++;
            }
        }
       
        
        
        //HashMap check 
        for(char ch : hm1.keySet()){
           if(!hm2.containsKey(ch) || !hm1.get(ch).equals(hm2.get(ch))){

                return false ;
            }
        }
         if(cnt== 2 || cnt == 0){
            return true;
        }
        return false ;
    }
}