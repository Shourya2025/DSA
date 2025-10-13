class Solution {
    public int maxNumberOfBalloons(String text) {
         HashMap<Character , Integer> hm = new HashMap<>();
        for(int i = 0; i< text.length() ; i++){
            char ch = text.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch , hm.get(ch)+1);
            }
            else {
                hm.put(ch , 1);
            }
        }
        for(char num : hm.keySet()){
            if(num =='b' ||num =='a' ||num =='n' ){
                hm.put(num , hm.get(num));
            }
            else if(num =='l' ||num =='o'){
                hm.put(num , hm.get(num)/2);
            }
            
        }
        int min = Integer.MAX_VALUE;
        for(char num:new char[]{ 'b','a','o','l','n'}){
           min =  Math.min(min ,hm.getOrDefault(num ,0));
        }
        return min;
    }
}