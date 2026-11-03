class Solution {
    public int minMoves(int[] arr) {

      int maximum=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>maximum) {
               maximum=arr[i];
           }

       }
        

       int sum=0;

       for (int i=0;i<arr.length;i++){
           int diff=maximum-arr[i];
           sum+=diff;

       }
       
    return sum;
    }

        
    
}