class Solution {
    public static boolean pali(String s){
        int left=0;
        int right=s.length()-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        String ans="";
        for(int i=0;i<words.length;i++){
           if(pali(words[i])){
            ans+=words[i];
            return ans;
           }
        }
        

        return "";
    }
}