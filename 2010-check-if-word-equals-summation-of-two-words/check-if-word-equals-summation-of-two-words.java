class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder f1 = new StringBuilder();
        StringBuilder f2 =  new StringBuilder();
        StringBuilder f3 =  new StringBuilder();
        for(int i = 0 ; i < firstWord.length() ; i++){
            char ch = firstWord.charAt(i);
            f1.append(ch-'a');

        }

         for(int j = 0 ; j < secondWord.length() ; j++){
            char ch = secondWord.charAt(j);
            f2.append(ch-'a');

        }

         for(int m = 0 ; m < targetWord.length() ; m++){
            char ch = targetWord.charAt(m);
            f3.append(ch-'a');

        }
        int a = Integer.parseInt(f1.toString());
        int b = Integer.parseInt(f2.toString());
        int c = Integer.parseInt(f3.toString());

        return (a+b) == c;


    }
}