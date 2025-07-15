class Solution {
    public boolean isValid(String s) {
        Stack<Character> sb = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch =='['|| ch =='{'|| ch =='(' ){
                sb.push(ch);
            }
            else if(sb.size()>0 && ch == ']' && sb.peek() == '['){
                sb.pop();
            }
            else if(sb.size()>0 && ch == '}' && sb.peek() == '{'){
                sb.pop();
            }
            else if(sb.size()>0 && ch == ')' && sb.peek() == '('){
                sb.pop();
            }
            else {
                return false;
            }
            
            

        }
        if(sb.size()>0){
            return false ;
        }
        else {
             return true ;
        }
       
        
    }
}