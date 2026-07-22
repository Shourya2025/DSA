class Solution {
    public boolean halvesAreAlike(String s) {
        int fh = 0 ;
        int sh = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if( ch == 'a'||ch == 'e' || ch ==  'i' || ch ==  'o' || ch == 'u' ||ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'||ch ==  'U'){
                if(i < s.length()/2){
                    fh++;
                 }else{
                    sh++;
                  }
            }
        }
        return fh == sh;
    }
}