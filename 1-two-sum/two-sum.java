class Solution {
    public int[] twoSum(int[] arr, int target) {
      int n=arr.length;
      int[][] numwithind=new int[n][2];

      for(int i=0;i<arr.length;i++){
        numwithind[i][0]=arr[i];
        numwithind[i][1]=i;
      }

      Arrays.sort(numwithind,(a,b)->Integer.compare(a[0],b[0]));

      int left=0;
      int right=arr.length-1;

      while(left < right){
        int sum=numwithind[left][0]+numwithind[right][0];

        if(sum < target){
            left++;
        }else if(sum > target){
            right--;
        }else{
            return new int[] {numwithind[left][1],numwithind[right][1]};
        }
      }

      return new int[] {-1,-1};
    }
}