class Solution {
    public static void del(int mat[][],int currentmax,int rowindex,int col){
        for(int j=0;j<col;j++){
            if(mat[rowindex][j]==currentmax){
                for(int k=j;k<col-1;k++){
                    mat[rowindex][k]=mat[rowindex][k+1];
                }
                break;
            }
        }
    }
    public int deleteGreatestValue(int[][] mat) {
         int row=mat.length;
         int col=mat[0].length;

         int ans=0;

         while(col > 0){
            int roundmax=0;

            for(int i=0;i<row;i++){
                int currentsum=0;
                for(int j=0;j<col;j++){
             if(currentsum < mat[i][j]){
                            currentsum=mat[i][j];
                }
            }
              del(mat,currentsum,i,col);
                roundmax=Math.max(roundmax,currentsum);
                }
             ans+=roundmax;
            col--;
         }


         return ans;
    }
}