class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='[' || ch=='{' || ch=='('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{

                    char popedchar=stack.pop();

                    if(popedchar=='{' && ch!='}' ||
                     popedchar=='[' && ch!=']' ||
                     popedchar=='(' && ch!=')'){
                        return false;
                     }
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }

        return false;
    }
}