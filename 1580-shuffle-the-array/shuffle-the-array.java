class Solution {
    public int[] shuffle(int[] nums, int n) {
        int num[]=new int[2*n];

        int j=0;
        for(int i=0;i<num.length;i=i+2){
          num[i]=nums[j];
          j++;
        }

        for(int k=1;k<num.length;k=k+2){
            num[k]=nums[j];
            j++;
        }

        return num;
    }
}