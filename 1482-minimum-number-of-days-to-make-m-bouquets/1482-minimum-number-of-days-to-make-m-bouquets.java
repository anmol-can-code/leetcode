class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k){
            return -1;
        }
        int low =bloomDay[0];
        int high = bloomDay[0];
        for(int i =1;i<bloomDay.length;i++){
            low =Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
        }
        while(low<high){
        int mid =low+(high-low)/2;
        if(days(bloomDay,mid,m,k)){
            high =mid;

        }
        else{
            low =mid+1;
        }
        
        
      
        }
        
    return low;    
    }
    private boolean days(int[] bloomDay,int mid,int m,int k){
        int bloom =0;
        int b =0;
        for(int i=0;i<bloomDay.length;i++){
            if(mid>=bloomDay[i]){
                bloom++;
                if(bloom==k){
                    b++;
                    bloom=0;
                }
            }
            else{
                bloom=0;
            }
        if(b==m){
            return true;
        }
        }
    return false;
    }
}