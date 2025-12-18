class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length ;
        Stack<Integer> st =  new Stack<>();
        for(int i = 0 ; i <n  ; i++){
            String s = operations[i];
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                st.push(2*st.peek());
            }
            else if(s.equals("+")){
                 if (st.size() >= 2) {
                int Top = st.pop();
                int secondTop = st.peek();
                int su = Top + secondTop;
                st.push(Top);
                st.push(su);
            }}
            else{
                st.push(Integer.parseInt(s));
            }
    
        }
        int sum = 0;
       
        while(!st.isEmpty()){
            sum = sum+ st.pop();
           

        }
        return sum;
    }
}