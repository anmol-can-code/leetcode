class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] st = s.toCharArray();
        int max =0;
        int min = 999999;
        for(int i =0;i<st.length;i++){
            map.put(st[i],map.getOrDefault(st[i],0)+1);


        }
        for(int i =0;i<st.length;i++){
            if(map.get(st[i])%2==1){
                max =Math.max(max,map.get(st[i]));
            }
            else{
                min=Math.min(min,map.get(st[i]));
            }
        }

    return max-min;   
    }
}