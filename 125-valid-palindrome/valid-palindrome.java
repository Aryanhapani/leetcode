class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();

        String s1="";

        String s2="";

        for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             if(ch >= 'a' && ch <= 'z' || ch >='0' && ch <= '9'){

                 s1=s1+ch;
             }
        }
           

        for (int i=s1.length()-1;i>=0;i--) {
              char ch=s1.charAt(i);
            
                s2=s2+ch;
          

           
        }


        if (s1.equals(s2)){
            return true;
        }

        return false;
    }
}