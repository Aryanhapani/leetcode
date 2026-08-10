class Solution {
    public int[] leftRightDifference(int[] arr) {
        
     int ans[]=new int[arr.length];

     int total=0;
     for (int i=0;i<arr.length;i++){
         total += arr[i];
     }


        int leftsum=0;
       for (int i=0;i<arr.length;i++){
           int rightsum=total - leftsum -arr[i];

           ans[i]=Math.abs(leftsum-rightsum);
           leftsum=leftsum+arr[i];

       }
        System.out.println(Arrays.toString(ans));
       
       return ans;
    }
}