class Solution {
    public String defangIPaddr(String address) {
        String[] arr = address.split("\\.");
        StringBuilder sm = new StringBuilder();
        for(int i = 0 ; i < arr.length ;i++){
            sm.append(arr[i]) ;
            sm.append("[.]") ;

        }
        return sm.toString().substring(0, sm.length()-3);
    }
}