class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int [] dp = new int [n];
        int [] dp2 = new int [n];
        int out =0;
        dp[0]=1;
        for(int i =1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
            dp[i]=dp[i-1]+1;
            }
            else{
                dp[i]=1;
            }

        }
        dp2[n-1]=1;
        for(int i =n-2;i>-1;i--){
            if(ratings[i]>ratings[i+1]){
            dp2[i]=dp2[i+1]+1;
            }
            else{
                dp2[i]=1;
            }
        }
        for(int i =0;i<n;i++){
            out+=Math.max(dp[i],dp2[i]);

        }
    return out;    
    }
}