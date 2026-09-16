class Solution {
    public static int countpre(String s,String pref){
      int count=0;
      int j=0;

      for(int i=0;i<pref.length();i++){
        if(j < s.length() && s.charAt(j)==pref.charAt(i)){
            count++;
            j++;
        }else{
            return 0;
        }
      }

      return count;

    }
    public int prefixCount(String[] words, String pref) {

        int finalcount=0;
        
        for(int i=0;i<words.length;i++){

            int co=countpre(words[i],pref);
            
            if(co == pref.length()){
                finalcount++;
            }

        }

        return finalcount;
    }
}