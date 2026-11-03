class Solution {
    public int finalValueAfterOperations(String[] opertatons) {
        int x=0;
          for (int i = 0; i < opertatons.length; i++) {
            if (opertatons[i].equals("--X") || opertatons[i].equals("X--")) {
                x=x-1;
            }else{
                x=x+1;
            }

        }

        return x;
        
    }
}