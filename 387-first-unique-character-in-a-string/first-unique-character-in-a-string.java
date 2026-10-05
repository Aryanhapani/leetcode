class Solution {
    public int firstUniqChar(String s) {
        int[] chars=new int[126];

        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);

            chars[ascii]++;
        }


        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);

           if(chars[ascii]==1){
            return i;
           }
        }


        return -1;
        
    }
}