class Solution {
    public int[] replaceElements(int[] arr) {

        int[] res=new int[arr.length];

    for (int i=0;i<arr.length;i++) {
        int max=arr[i];
        for (int j=i+1;j<arr.length;j++) {
            if(arr[j] > max){
                max=arr[j];
            }
        }
            res[i]=max;
            
    }

        for (int i=0;i<arr.length-1;i++) {
            res[i]=res[i+1];
        }

        res[arr.length-1]=-1;

    
        return res;
    }
}