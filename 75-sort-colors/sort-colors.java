class Solution {
    public void sortColors(int[] arr) {
        int zerocount=0;
        int onecount=0;
        int twocount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zerocount++;
            }
             if(arr[i]==1){
                onecount++;
            }
            if(arr[i]==2){
                twocount++;
            }
        }
        int k=0;
        for(int i=0;i<zerocount;i++){
            arr[k]=0;
            k++;
        }

        for(int j=0;j<onecount;j++){
            arr[k]=1;
            k++;
        }

        for(int l=0;l<twocount;l++){
            arr[k]=2;
            k++;
        }
    }
}