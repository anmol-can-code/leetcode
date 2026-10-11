class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] pos = new int[n/2];
        int [] neg = new int [n/2];
        int p =0;
        int ne=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>0){
                pos[p]=nums[i];
                p++;
            }
            else{
                neg[ne]=nums[i];
                ne++;
            }

        }
        int j =0;
        int k =0;
        while(j<n){
            nums[j]=pos[k];
            j++;
            nums[j]=neg[k];
            j++;
            k++;

        }
        return nums;
    }
}