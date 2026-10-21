class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i =0;
        int j =0;
        long sum =0;
        long max =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<nums.length){
            if(map.size()<k && map.size()==j-i){
                sum +=nums[j];
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                j++;
            }
            else{
                sum -=nums[i];
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            if(map.size()==k && map.size()==j-i){
                max=Math.max(max,sum);
            }
        }
    return max;   
    }
}