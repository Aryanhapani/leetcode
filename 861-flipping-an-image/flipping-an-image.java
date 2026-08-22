class Solution {
    public int[][] flipAndInvertImage(int[][] mat) {
     int row=mat.length;
    int col=mat[0].length;

       for(int i=0;i<row;i++) {


           int left = 0;
           int right = col - 1;
           while (left <= right) {


               int t = mat[i][left];
               mat[i][left] = mat[i][right];
               mat[i][right] = t;
               left++;
               right--;


           }
       }

    for(int k=0;k<row;k++){
        for(int j=0;j<col;j++){
            if(mat[k][j]==0){
                mat[k][j]=1;
            }else{
                mat[k][j]=0;
            }
//System.out.print(mat[k][j]+" ");
        }
       // System.out.println(" ");
    }

        return mat;
    }
}