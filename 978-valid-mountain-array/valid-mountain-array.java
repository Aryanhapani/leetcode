class Solution {
    public boolean validMountainArray(int[] arr) {

        if(arr.length <3){
            return false;
        }

        
       int max = Integer.MIN_VALUE; ;
        int index=0;

        for (int i=0;i<arr.length;i++) {
            if (arr[i]>max) {
                max=arr[i];
                index=i;
            }
        }

        if(index==0 || index==arr.length-1){
            return false;
        }

        

      

        for (int j=0;j<index;j++){
            

            if(arr[j] >= arr[j+1]){
                return false;
            }
        }

        for (int k=index;k<arr.length-1;k++){
           
            if(arr[k] <= arr[k+1]){
                return false;
            }
        }
        return true;
        
    }
}