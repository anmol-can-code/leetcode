class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];
        int mid =0;
        for(int i =0;i<piles.length;i++){
           
            high=Math.max(high,piles[i]);
        }
        while(low<high){
            mid = low+(high-low)/2;
            if(hour(piles,h,mid)){
                high = mid;
            }
            else{
                low = mid+1;
            }

        }
    return low;    
    }
    private boolean hour(int[] piles, int h, int mid){
        int count=0;
        for(int i =0;i<piles.length;i++){
            int x = piles[i];
            count += (x+(mid-1))/mid;
            if(count>h){
                return false;
            }


        }
        return true;
    }

}