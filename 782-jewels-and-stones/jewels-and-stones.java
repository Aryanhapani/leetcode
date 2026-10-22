class Solution {
    public int numJewelsInStones(String jewels, String stones) {

          HashMap<Character,Integer> h=new HashMap<>();


           for(int i=0;i<stones.length();i++){
            char c=stones.charAt(i);

            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }else{
                h.put(c,1);
            }
           }



           int count=0;

           for(int i=0;i<jewels.length();i++){
               char c=jewels.charAt(i);
                           
                if(h.containsKey(c)){
                    count += h.get(c);
                }

           }
        return count;
    }
}