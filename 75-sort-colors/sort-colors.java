class Solution {
    public void sortColors(int[] arr) {
       int zerocount=0;
       int onecount=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            zerocount++;
        }
        if(arr[i]==1){
            onecount++;
        }
    
       }
        
        //for 0
       for(int i=0;i<zerocount;i++){
        arr[i]=0;
       }

       //for 1
       for(int i=zerocount;i<zerocount+onecount;i++){
        arr[i]=1;
       }

       //for 2
       for(int i=zerocount+onecount;i<arr.length;i++){
        arr[i]=2;
       }
    }
}