class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        Map<String , Integer> mp = new HashMap<>();
        for(String num : arr1){
            if(mp.containsKey(num)){
                mp.put(num , mp.get(num)+1);
            }else{
                mp.put(num , 1);
            }
        }
        for(String nums : arr2){
            if(mp.containsKey(nums)){
                mp.put(nums , mp.get(nums)+1);
            }else{
                mp.put(nums , 1);
            }
        }
        List<String> ls = new  ArrayList<>();
        for(String word :mp.keySet() ){
            if(mp.get(word) == 1){
                ls.add(word);
            }
        }
        String[] ans = new String[ls.size()];
        int m = 0;
        for(String anss :ls ){
            ans[m++] = anss;
        }
        return ans;
        
    }
}