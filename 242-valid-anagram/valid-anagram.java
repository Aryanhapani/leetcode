class Solution {
    public boolean isAnagram(String S1, String S2) {

        if(S1.length() != S2.length()){
            return false;
        }

     char[] str1=S1.toCharArray();
     char[] str2=S2.toCharArray();

     Arrays.sort(str1);
     Arrays.sort(str2);

     for (int i=0;i< str2.length;i++){
         if (str1[i]!=str2[i]){
            return false;
         }
     }



     return true;

        
    }
}