class Solution {
    public boolean isAnagram(String s, String t) {
        //HashMap Question.
        /*HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0 ; i <s.length() ;i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch) == true){
                hm.put(ch ,hm.get(ch)+1);
            }
            else {
                hm.put(ch ,1);

            }
        }
        for(int i = 0 ; i <t.length() ;i++){
            char ch = t.charAt(i);
            if(hm.containsKey(ch) == true){
               if(hm.get(ch) == 1){
                hm.remove(ch);
               }
               else {
                hm.put(ch , hm.get(ch)-1);
               }
            }
            else {
              return false;
                
            }
        }
        if(hm.size()>0){
            return false ;
        }
        else{
            return true;
        }
        */


        // Appraoch 2 ----> faster approach
        if(s.length() != t.length()){
            return false ;

        }
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}