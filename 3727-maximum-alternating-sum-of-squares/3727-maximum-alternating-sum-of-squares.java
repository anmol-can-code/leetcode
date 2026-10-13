class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i =0;i<nums.length;i++){
            nums[i]= nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long out=0;
        int j =0;
        int k = nums.length-1;
        while(j<=k){
            out += nums[k];
            k--;
            out-=nums[j];
            j++;

        }
        if(nums.length%2==1){
        j=nums.length/2;
        out+=nums[j];
        }
    return out;
    }
}