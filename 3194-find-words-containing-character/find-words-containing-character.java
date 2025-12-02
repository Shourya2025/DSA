class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ls = new ArrayList<>();
        for(int i = 0 ; i < words.length ; i++){
            for(int j = 0 ; j< words[i].length() ;j++){
                char ch = words[i].charAt(j);
                if(ch == x){
                    ls.add(i);
                    break;
                }
            }
        }
        return ls;
        
        
    }
}