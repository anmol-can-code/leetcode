class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> map = new HashMap<>();
        int i =0;
        int j =0;
        int max =0;
        while(j<s.length()){
            if(map.size()==(j-i)){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            j++;
          
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            if(map.size()==(j-i)){
            max =Math.max(max,(j-i));
            }
        }
    return max;    
    }
}