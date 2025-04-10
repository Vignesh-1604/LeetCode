class Solution {
    public boolean checkRecord(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                result++;
            }
            if(result>1){
                return false;
            }
            if(s.contains("LLL")){
                return false;
            }
        }
        return true;
    }
}