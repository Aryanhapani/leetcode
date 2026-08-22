class Solution {
    public int countNegatives(int[][] mat) {
        int row=mat.length;
    int col=mat[0].length;
   int c=0;
   for(int i=0;i<row;i++){
       for(int j=0;j<col;j++){
           if(mat[i][j] < 0){
               c++;
           }
       }
   }

   return c;
    }
}