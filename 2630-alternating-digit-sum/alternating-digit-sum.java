class Solution {
    public int alternateDigitSum(int n) {
         
        String str=String.valueOf(n);

        int sum=0;

        for (int i = 0; i < str.length(); i++) {
            int ch=str.charAt(i)-'0';

            if (i%2==0){
                sum+=ch;
            }else{
                sum-=ch;
            }
        }
        return sum;
    }
}