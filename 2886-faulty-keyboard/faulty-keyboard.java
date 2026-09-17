class Solution {
    public static String rev(String s){
        char[] arr=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left < right){
            char t=arr[left];
            arr[left]=arr[right];
            arr[right]=t;

            left++;
            right--;
        }
        s=new String(arr);

        return s;
    }
    public String finalString(String s) {
         char[] arr=s.toCharArray();

         String str2="";

         for(int i=0;i<arr.length;i++){
            if(arr[i]=='i'){
                str2=rev(str2);
            }else{
                str2+=arr[i];
            }
         }
        

        return str2;
    }
}