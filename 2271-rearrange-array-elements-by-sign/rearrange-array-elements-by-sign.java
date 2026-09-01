class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] arr2=new int[arr.length];
        int j=1;
        int k=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i] < 0){
            arr2[j]=arr[i];
            j=j+2;
           }

           if(arr[i] > 0){
            arr2[k]=arr[i];
            k=k+2;
           }
        }


        return arr2;
    }
}