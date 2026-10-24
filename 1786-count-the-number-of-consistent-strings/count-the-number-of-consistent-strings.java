class Solution {
    public static boolean convert(String s,HashSet<Character> hset){
     
      for(int i=0;i<s.length();i++){

        if(!hset.contains(s.charAt(i))){
            return false;
        }

        
      }
        return true;

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