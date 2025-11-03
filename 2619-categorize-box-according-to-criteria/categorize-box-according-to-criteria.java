class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean Bulky = false;
        boolean Heavy = false;
        long vol = (long) height*width*length;
        if(length >= Math.pow(10,4) || width >= Math.pow(10,4) || height >= Math.pow(10,4)|| vol >= Math.pow(10,9) ){
            Bulky = true;
        }
        if(mass>=100){
            Heavy =true;
        }

        if((Heavy && Bulky) == true){
            return "Both";

        }
        else if(Bulky == true && Heavy == false){
            return "Bulky";
        }
         else if(Bulky == false && Heavy == true){
            return "Heavy";
        }
        else {
            return "Neither";
        }
    }
}