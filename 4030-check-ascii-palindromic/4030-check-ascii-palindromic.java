class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        for(int i =0;i<s.length();i++){
            byte as = (byte)(s.charAt(i));
            for(int k=0;k<8;k++){
                if((as&1)==0){
                    sb.append('0');
                }
                else{
                    sb.append('1');
                }
                as = (byte)(as>>1);
            }
            sb=sb.reverse();
            sb2.append(sb);
            sb.setLength(0);
        }
        int i =0;
        int j = sb2.length()-1;
        while(j>i){
            if(sb2.charAt(i)==sb2.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }

        return true;
    }
}