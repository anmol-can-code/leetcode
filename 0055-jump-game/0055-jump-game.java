class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int req =1;
        for(int i = nums.length-2;i>-1;i--){
            if(nums[i]>=req){
                if(i==0){
                    return true;
                }
                req=1;
                
            }
            else{
                req++;
            }

        }
    return false;   
    }
}