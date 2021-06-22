class Sol
{
    int closing (String s, int pos)
    {
        int i=pos+1;
        int index=0;
        int openBracket=0;
        while(i<s.length()){
            if(s.charAt(i)==']'){
                if(openBracket==0){
                    index=i;
                    break;
                }
                else{
                    openBracket--;
                }
            }
            
            else if(s.charAt(i)=='['){
                openBracket++;
            }
            i++;
        }
        
        return index;
    }
}
