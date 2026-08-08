class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n[]=new int[nums.length];
        int n2[]=new int[nums.length];
        int ans[]=new int[nums.length];

        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            n[i]=leftsum;
            leftsum=leftsum+nums[i];
        }

        int rightsum=0;
        for(int j=nums.length-1;j>=0;j--){
            n2[j]=rightsum;
            rightsum=rightsum+nums[j];
        }

        for(int k=0;k<nums.length;k++){
            ans[k]=Math.abs(n[k]-n2[k]);
        }
       
       return ans;
    }
}