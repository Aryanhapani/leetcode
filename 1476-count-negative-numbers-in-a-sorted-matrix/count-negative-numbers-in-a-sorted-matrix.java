class Solution {
    public int countNegatives(int[][] mat) {
        int row=mat.length;
    int col=mat[0].length;
   int c=0;
     
     int i=0;
     int j=col-1;

     while(i<row && j>=0){
        if(mat[i][j] < 0){
            c=c+row-i;
            j--;
        }else{
            i++;
        }
     }
return c;
   }

}

 