class Solution {
    public void rotate(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;

        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }

        for(int i=0;i<row;i++){
            int l=0;
            int m=col-1;

            while(l <m){
                int t=mat[i][l];
                mat[i][l]=mat[i][m];
                mat[i][m]=t;

                l++;
                m--;
            }
        }
    }
}