class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
       HashSet<Integer> duplicate=new HashSet<>();

       for (int i=0;i<nums.length;i++) {
           if(seen.contains(nums[i])){
               duplicate.add(nums[i]);
           }else{
               seen.add(nums[i]);
           }
       }

      

       int count=0;
       for (int i=0;i<nums.length;i++) {
           if(!duplicate.contains(nums[i])){
               count=count+nums[i];
           }
       }
        
        return count;

    }
}