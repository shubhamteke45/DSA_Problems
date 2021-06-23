class Sol
{
    int binaryPalin (long N)
    {
             String s = Integer.toBinaryString((int)N);
             
             int i=0;
             int j=s.length()-1;
             int res=0;
             while(i<j){
                 if(s.charAt(i)== s.charAt(j)){
                     res=1;
                     i++;
                     j--;
                 }
                 else{
                     res=0;
                     break;
                 }
             }
             
             return res;
    }
}
