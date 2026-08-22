class Solution {
    public int[][] flipAndInvertImage(int[][] mat) {
     int row=mat.length;
    int col=mat[0].length;

       for(int i=0;i<row;i++) {


           int left = 0;
           int right = col - 1;
           while (left <= right) {


               int t = mat[i][left];
               mat[i][left] =1- mat[i][right];
               mat[i][right] =1- t;
               left++;
               right--;


           }
       }

   

        return mat;
    }
}