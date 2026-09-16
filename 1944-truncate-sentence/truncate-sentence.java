class Solution {
    public String truncateSentence(String s, int k) {
       String[] strings=s.split(" ");
       String str2="";
      
       for (int i=0;i<k;i++){
           str2=str2+strings[i];


           if(i<k-1){
            str2=str2+" ";
           }
       }
       s=new String(str2);
       

       return s;
    }
}