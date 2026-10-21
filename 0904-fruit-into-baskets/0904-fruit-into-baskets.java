class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i =0;
        int j =0;
        int max=1;
        while(j<nums.length){
            if(map.size()<3){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                j++;
            }
            else{
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            if(map.size()<3){
                max=Math.max(max,j-i);
            }
        }

    return max;    
    }
}