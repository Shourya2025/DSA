class Solution {
    public boolean checkPerfectNumber(int num) {
        ls.clear();
        divisor(num);
        int sum = 0 ;

        for(int i = 0 ; i < ls.size() ; i++){
            sum = sum + ls.get(i);

        }
        if(num == sum){
            return true ;
        }
        else {
            return false ;
        }
    }
    static ArrayList<Integer> ls = new ArrayList<>();
    void divisor(int num){
       // ArrayList<Integer> ls = new ArrayList<>();
        int n = num/2;
        // half only contain divisor
        int i =1;
        while(i <= n){
            if(num%i == 0){
                ls.add(i);

            }
            i++;
        }


    }
}