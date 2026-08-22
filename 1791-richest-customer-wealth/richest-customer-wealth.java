class Solution {
    public int maximumWealth(int[][] mat) {
         int row=mat.length;
    int col=mat[0].length;


    int max=0;
    for(int i=0;i<row;i++){
        int sum=0;
        for(int j=0;j<col;j++){
            sum+=mat[i][j];
        }
        if(max < sum){
            max=sum;
        }
    }

    return max;
    }
}