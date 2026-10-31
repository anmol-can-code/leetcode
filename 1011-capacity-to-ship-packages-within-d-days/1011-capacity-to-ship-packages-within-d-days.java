class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high=0;
        int low = weights[0];
        for(int i =0;i<weights.length;i++){
            high+=weights[i];
            low = Math.max(low,weights[i]);

        }
        
        while(low<high){
            int mid =low +(high-low)/2;
            if(day(weights,days,mid)){
                high = mid;
            }
            else{
                low= mid+1;
            }

        }
    return low;    
    }
    private boolean day(int [] weights, int days, int mid){
       int weight = mid;
       int i =0;
       while(days>0){
        weight = mid;
        while(weight>0 && weights.length>i){
            weight-=weights[i];
            i++;
        }
        if(weight<0){
            weight+=weights[i-1];
            i--;
        }
        days--;
        if(weights.length == i && days ==0){
            return true;
        }
        

       }
    return false;
    }
}