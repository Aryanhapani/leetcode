class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean>  re=new ArrayList<>();
         
         int max=0;
        for(int i=0;i<candies.length;i++){
            if(max  < candies[i]){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max){
                re.add(true);
            }else{
                re.add(false);
            }
        }
        return re;
    }
}