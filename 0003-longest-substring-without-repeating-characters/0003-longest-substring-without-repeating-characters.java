class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0;
        int i =0;
        int j =0;
        HashMap <Character, Integer> map = new HashMap<>();
        while(i<s.length()){ 
          
            if(map.getOrDefault(s.charAt(i),0)>0){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                j++;
            } 
            else{
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
             i++;
            }
            max =Math.max(max,i-j);

        }
    return max;   
    }
}