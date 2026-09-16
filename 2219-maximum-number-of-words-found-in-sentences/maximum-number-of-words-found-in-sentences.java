class Solution {
    public static int countword(String s){
        int  c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=' ' && s.charAt(i-1)== ' '){
                c++;
            }
        }

        return c;

    }
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            int count=countword(sentences[i]);

            if(max < count){
                max=count;
            }
        }

        return max;
    }
}