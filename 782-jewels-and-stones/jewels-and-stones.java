class Solution {
    public int numJewelsInStones(String s, String s1) {

          HashMap<Character,Integer> h=new HashMap<>();


        for (int i=0;i<s1.length();i++) {
            char c = s1.charAt(i);
            if (h.containsKey(c)) {
                h.put(c,h.get(c)+1);
            }else{
                h.put(c,1);
            }
        }
        int count = 0 ;
       for(int i = 0 ; i < s.length() ; i++) {
           if(h.containsKey(s.charAt(i))) {
               count += h.get(s.charAt(i));
           }
       }
        return count;
    }
}