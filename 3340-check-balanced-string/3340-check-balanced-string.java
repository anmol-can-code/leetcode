class Solution {
    public boolean isBalanced(String num) {
        int odd =0;
        int even =0;
        for(int i =0;i<num.length();i++){
            if((i&1)==0){
                odd+=(int)num.charAt(i)-(int)'0';
            }
            else{
                even+=(int)num.charAt(i)-(int)'0';
            }
        }
    return (odd==even);    
    }
}