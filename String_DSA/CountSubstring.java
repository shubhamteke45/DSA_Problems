class Solution
{
    int countSubstr (String S)
    {
        int i=0;
        int cns=0;
        int cn1=0;
        
        while(i<S.length()){
            if(S.charAt(i)=='1'){
                cns+=cn1;
                cn1++;
            }
            i++;
        }
        
        return cns;
    }
}
