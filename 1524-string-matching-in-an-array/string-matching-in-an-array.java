class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        Set<String> st = new HashSet<>();
        for(int i =  0 ; i < words.length ; i++){
            for(int j = 0 ; j < words.length ; j++){
                if(i != j){
                    if(words[i].contains(words[j])){
                        if(!st.contains(words[j])){
                        ans.add(words[j]);
                        st.add(words[j]);
                        }
                    }
                }
            }
        }
        return ans;
    }
}