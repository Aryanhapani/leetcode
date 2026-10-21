class Solution {
    public void duplicateZeros(int[] arr) {


       int j=0;

       while(j < arr.length){
        if(arr[j]==0){
            for(int k=arr.length-1;k>j;k--){
                arr[k]=arr[k-1];
            }

            j++;
        }


        j++;
       }

    }
}