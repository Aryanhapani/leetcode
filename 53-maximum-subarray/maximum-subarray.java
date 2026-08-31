class Solution {
    public int maxSubArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];

            if(max < currsum){
                max=currsum;
            }

            if(currsum < 0){
                currsum=0;
            }
        }

        return max;
    }
}