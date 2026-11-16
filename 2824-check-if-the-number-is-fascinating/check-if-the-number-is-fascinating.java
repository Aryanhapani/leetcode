class Solution {
    public boolean isFascinating(int n) {
         
       int n2=2*n;
       int n3=3*n;
       String last=String.valueOf(n)+String.valueOf(n2)+String.valueOf(n3);
       if(last.length()>9){
        return false;
       }

      for (int i=1;i<=9;i++){
            if (!last.contains(String.valueOf(i))){
                return false;
            }
        }
       

       return true;

    }
}