class Solution {
    public int[] replaceElements(int[] arr) {

        int[] res=new int[arr.length];

    int max=-1;

    for (int i=arr.length-1;i>=0;i--) {
        if (arr[i]>max) {
            max=arr[i];
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