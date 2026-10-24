class Solution {
    public static boolean convert(String s,HashSet<Character> hset){
      HashSet hst=new HashSet<>();

      for(int i=0;i<s.length();i++){
        hst.add(s.charAt(i));
      }

      return hset.containsAll(hst);
    }
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hset=new HashSet<>();

        for(int i=0;i<allowed.length();i++){
            hset.add(allowed.charAt(i));
        }

         int count=0;
        for(int i=0;i<words.length;i++){

            boolean ans=convert(words[i],hset);

            if(ans){
                 count++;
            }

        }

        return count;
        
    }
}