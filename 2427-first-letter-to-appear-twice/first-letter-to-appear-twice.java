class Solution {
    public char repeatedCharacter(String s) {
        String s2="";

          HashSet<Character> hset=new HashSet<>();
         for (int i=0;i<s.length();i++){
          if (hset.contains(s.charAt(i))){
              s2+=s.charAt(i);
              break;
          }else {
              hset.add(s.charAt(i));
          }
      }
       
       return s2.charAt(0);
        
    }
}