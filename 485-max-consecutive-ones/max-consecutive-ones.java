class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        

        int max=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                c++;
            }

            if(max< c){
                max=c;
            }

            if(arr[i]==0){
                c=0;
            }
        }

        return max;
    }
}