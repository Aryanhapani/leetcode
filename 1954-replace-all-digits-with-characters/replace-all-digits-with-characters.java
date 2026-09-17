class Solution {
    public static char rep(char s,char s2){
        int ascii=s;
        int ascii1=s2-'0';
        int ascii2=ascii + ascii1;

        char ne=(char) ascii2;

        return ne;
    }
    public String replaceDigits(String s) {
        String s2="";
        char[] arr=s.toCharArray();
        s2+=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] >= '0' && arr[i] <= '9'){
                char so=rep(arr[i-1],arr[i]);
                s2+=so;
            }else{
                s2+=arr[i];
            }
        }


        return s2;
        
    }
}