class Solution {
    public int countword(String s){
        String[] str=s.split(" ");
        int count=0;

        for(int i=0;i<str.length;i++){
            count++;
        }

        return count;
    }
    public int mostWordsFound(String[] sentences) {
        
        int maxcount=0;
        for(int i=0;i<sentences.length;i++){
          if(maxcount < countword(sentences[i])){
            maxcount=countword(sentences[i]);
          }
        }


        return maxcount;

        
    }
}