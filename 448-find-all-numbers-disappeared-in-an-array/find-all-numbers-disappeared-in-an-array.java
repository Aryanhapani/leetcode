class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hset=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            hset.add(nums[i]);
        }

        List<Integer> res=new ArrayList<>();

        for(int i=1;i<=nums.length;i++){
           if(!hset.contains(i)){
             res.add(i);
           }
        }


        return res;
    }
}