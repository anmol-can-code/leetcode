class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count =1;
        int len = nums.length/3;
        if(nums.length==1){
         list.add(nums[0]);
         return list;
        }
        Arrays.sort(nums);
        for(int i =1;i<nums.length;i++){ 
          
            if(nums[i-1]==nums[i]){
                count++;
               
            
            }
            else{  
                if(len<count){
                list.add(nums[i-1]);
                }
                count =1;
            }
            

            
        }
        if(len<count){
            list.add(nums[nums.length-1]);
        }
    return list;    
    }
}