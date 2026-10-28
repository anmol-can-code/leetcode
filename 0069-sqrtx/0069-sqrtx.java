class Solution {
    public int mySqrt(int x) {
        long low =0;
        long high =x;
        while(low<high){
            long mid = low+(high-low+1)/2;
            if((long)mid*mid==x){
                return (int)mid;
            }
            else if((long)mid*mid>x){
                high = (int)mid-1;
            }
            else{
                low =(int)mid;
            }
                  
                  
         }
    return (int) low;   
    }
}