class Solution {
    public void binary(int[] arr,int start,int end){
        while(start <= end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        binary(arr,0,arr.length-1);
        binary(arr,0,k-1);
        binary(arr,k,arr.length-1);


    }
}