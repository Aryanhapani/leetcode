class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;

        //find row
        int sr=0;
        int er=row-1;
        int findrow=0;

        while(sr <= er){
            int middle=(sr+er)/2;

            if(matrix[middle][0] <= target && matrix[middle][col-1] >= target ){
                findrow=middle;
                break;
            }else if(matrix[middle][0] < target ){
                sr=middle+1;
            }else{
                er=middle-1;
            }
        }
 

        int l=0;
        int m=col-1;
        while(l<=m){
            int colmid=(l+m)/2;

            if(matrix[findrow][colmid]==target){
                return true;
            }else if(matrix[findrow][colmid] < target){
                l=colmid+1;
            }else{
                m=colmid-1;
            }
        }

        return false;
    }
}