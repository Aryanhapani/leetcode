class Solution {
    public int diagonalSum(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        
        int sum=0;
        for(int i=0;i<row;i++){
            sum+=mat[i][i];
           
           if(i!=col-1-i){

            sum+=mat[i][col-i-1];
           }

        }

        return sum;
    }
}