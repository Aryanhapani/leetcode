class Solution {
    public boolean checkIfPangram(String sentence) {

        String alphabets="abcdefghijklmnopqrstuvwxyz";

        HashSet<Character> hset=new HashSet<>();

        for(int i=0;i< sentence.length();i++){
            hset.add(sentence.charAt(i));
        }

        for(int i=0;i<alphabets.length();i++){
          
          if(!hset.contains(alphabets.charAt(i))){
            return false;
          }
        }

        return true;
        
    }
}