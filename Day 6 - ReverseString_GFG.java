class Solution {
    static String revStr(String S) {
        // code here
        String s1="";
        for(int i=0;i<S.length();i++)
        {
            s1+=S.charAt(S.length()-i-1);
        }
        return s1;
    }
}
