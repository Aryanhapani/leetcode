class Solution {
    public int minPathSum(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;

        int sum=0;
        for(int i=1;i<col;i++){
            mat[0][i]=mat[0][i]+mat[0][i-1];
        }

         for(int i=1;i<row;i++){
            mat[i][0]=mat[i][0]+mat[i-1][0];
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                mat[i][j]=mat[i][j]+Math.min(mat[i-1][j],mat[i][j-1]);
            }
        }

        return mat[row-1][col-1];
    }
}