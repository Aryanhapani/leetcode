class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;

        List<Integer> ans=new ArrayList();
         int c=0;
        for(int i=0;i<row;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<col;j++){
                if(min > mat[i][j]){
                    min=mat[i][j];
                    c=j;
                }
            }
            int max=Integer.MIN_VALUE;
            for(int k=0;k<row;k++){
              if(max < mat[k][c]){
                max=mat[k][c];
              }
            }

            if(max==min){
                ans.add(min);
            }
        }

        return ans;
    }
}