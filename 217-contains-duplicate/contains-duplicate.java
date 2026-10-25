class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> hst=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (hst.contains(nums[i])){
               return true;
            }else{
                hst.add(nums[i]);
            }
        }

        return false;
    }
}