class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n=arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(i > 0 && arr[i]==arr[i-1]){
                continue;
            }

            for(int j=i+1;j<arr.length;){
                int p=j+1;
                int q=n-1;
                while(p < q){
                    long sum=( long)arr[i]+arr[j]+arr[p]+arr[q];
                    if(sum < target){
                        p++;
                    }else if(sum > target){
                        q--;
                    }else{
                        ans.add(Arrays.asList(arr[i],arr[j],arr[p],arr[q]));
                        p++;
                        q--;

                        while(p <  q  && arr[p]==arr[p-1]){
                            p++;
                        }
                    }
                }
                j++;
                while( j < n && arr[j]==arr[j-1]){
                    j++;
                }
            }
        }

        return ans;
    }
}