class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long total =0;
        StringBuilder sb = new StringBuilder("");
        char [] st = s.toCharArray();
        for(int i =0;i<shifts.length;i++){
            total += shifts[i];
        }
        for(int i =0;i<s.length();i++){
            sb.append((char)('a'+((long)st[i]-'a'+total)%26));
            total-=shifts[i];

        }
        return sb.toString();
    }
}