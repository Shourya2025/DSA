class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character , Integer> hmv = new HashMap<>();
        HashMap<Character , Integer> hmc = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                if(hmv.containsKey(ch)){
                    hmv.put(ch , hmv.get(ch)+1);
                }else{
                    hmv.put(ch , 1);
                }
            }
            else{
                if(hmc.containsKey(ch)){
                    hmc.put(ch , hmc.get(ch)+1);
                }else{
                    hmc.put(ch , 1);
                }
            }
        }
        int maxv = 0;
        int maxc = 0;
        for(int num : hmv.values()){
            if(num > maxv){
                maxv = num;
            }
        }
        for(int nums : hmc.values()){
            if(nums > maxc){
                maxc = nums;
            }
        }
        return maxv+maxc;


    }
}