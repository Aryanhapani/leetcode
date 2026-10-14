class Solution {
    public boolean rotateString(String s, String goal) {


        if(s.length() != goal.length()){
            return false;
        }

       String finalString=s.concat(s);


        if(finalString.contains(goal)){
            return true;
        }

        return false;
        
    }
}