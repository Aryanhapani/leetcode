class Solution {
    public String sortSentence(String s) {

          String s2 = "";
        String[] str = s.split(" ");
        int n=str.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                char digit1 =str[j].charAt(str[j].length() - 1);
                char digit2 = str[j + 1].charAt(str[j + 1].length() - 1);
                int num1=digit1-'0';
                int num2=digit2-'0';



                if (num1 > num2) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }

            }
               // System.out.println(Arrays.toString(str));
        }

            for (int k=0;k< str.length;k++){

                String res=str[k].substring(0, str[k].length()-1);
                s2+=res;
                if (k < str.length-1){
                    s2+=" ";
                }
            }
      return s2;
        
    }
}