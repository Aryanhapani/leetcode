class Solution {
    public int[][] largestLocal(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int maxlocal[][]=new int[row-2][col-2];

        for(int r=0;r<row-2;r++){
            for(int c=0;c<col-2;c++){
               
                 int max=Integer.MIN_VALUE;
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                    if(max < mat[r+i][c+j]){
                         max=mat[r+i][c+j];
                    }
                    }
                }

                maxlocal[r][c]=max;
            }
        }
        

        return maxlocal;
    }
}