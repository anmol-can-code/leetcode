class Solution {
    public int sumOfSquares(int[] nums) {
        int res =0;
        for(int i =1;i<=nums.length;i++){
            if(nums.length%i==0){
                res+= Math.pow(nums[i-1],2);
            }
        }
    return res;   
    }
}