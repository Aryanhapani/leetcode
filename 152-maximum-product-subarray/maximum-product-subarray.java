class Solution {
    public int maxProduct(int[] arr) {
        int ans=Integer.MIN_VALUE;
        int prefix=0;
        int suffix=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(prefix==0){
                prefix=1;
            }

            if(suffix==0){
                suffix=1;
            }

            prefix*=arr[i];
            suffix*=arr[n-i-1];

            ans=Math.max(ans,Math.max(prefix,suffix));
        }

        return ans;
    }
}