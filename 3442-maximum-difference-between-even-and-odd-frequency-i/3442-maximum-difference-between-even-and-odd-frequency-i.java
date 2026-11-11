class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
       
        int max =0;
        int min = 999999;
        for(int i =0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);


        }
        for(int i =0;i<s.length();i++){
            if(map.get(s.charAt(i))%2==1){
                max =Math.max(max,map.get(s.charAt(i)));
            }
            else{
                min=Math.min(min,map.get(s.charAt(i)));
            }
        }

    return max-min;   
    }
}