class Solution {
    public boolean isUgly(int n) {
        // ArrayList<Integer> factor = new ArrayList<>();
        // for(int i = 0 ; i < factor.size() ; i++){
        //     if(factor.get(i)!= 2 || factor.get(i)!= 3 ||factor.get(i)!= 5){
        //         return false;
        //     }
        // }
        // return true;


        if(n<=0){
            return false;
        }
        while(n%2==0){
            n = n/2;
        }
         while(n%3==0){
            n = n/3;
        }
         while(n%5==0){
            n = n/5;
        }

        return n==1;






    }
    // public void factor(ArrayList<Integer> factor , int n){
    //     factor.clear();
    //     int i = 2;
    //     while(i!=n){
    //         if(n%i==0){
    //             factor.add(i);
    //             n/=i;
    //         }
    //         else{
    //             i++;
    //         }
    //     }

    // }
}