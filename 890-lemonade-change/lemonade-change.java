class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five =0;
        int ten = 0 ;
        int twenty = 0;
        for(int i = 0 ; i<bills.length ; i++){
            if(bills[i] ==5){
                five++;
            }
            else if(bills[i] ==10){
                if(five>=1){
                    five--;
                    ten++;

                }else if(five==0){
                    return false ;

                }

            }
            else if(bills[i] == 20){
                if(ten>=1 && five>=1){
                    ten--;
                    five--;
                    twenty++;

                }
                else if(five>=3){
                    twenty++;
                    five = five-3;

                }
                
                else{
                    return false ;
                }
            }

        }

    return true;           
  }
}