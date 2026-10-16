class Solution {
    public void setZeroes(int[][] matrix) {
        Stack<Integer> sti = new Stack<>();
        Stack<Integer> stj = new Stack<>();
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    sti.push(i);
                    stj.push(j);
                    }
            }
        }
        while(!sti.isEmpty()){
            int k = sti.pop();
            for(int i =0;i<matrix[0].length;i++){
                matrix[k][i]=0;
            }
        }
        while(!stj.isEmpty()){
            int l = stj.pop();
            for(int i=0;i<matrix.length;i++){
                matrix[i][l]=0;
            }
        }
        
    }
}