class Solution{
    // Function to find the character in patt which is present in str at min index
    public static String printMinIndexChar(String str, String patt){
        
        int i=0, n=patt.length();
        
        int minIndex=Integer.MAX_VALUE;
        int flag=0;
        while(i<n){
            char elm = patt.charAt(i);
            int index=0;
            int j=0, k=str.length()-1;
            while(j<=k){
                if(str.charAt(j)==elm){
                    index=j;
                    flag=1;
                    minIndex = Math.min(minIndex, index);
                }
                else if(str.charAt(k)==elm){
                    index=k;
                    flag=1;
                    minIndex=Math.min(minIndex, index);
                }
                j++;
                k--;
            }
            i++;
        }
        
        if(flag==0){
            return "$";
        }
        else{
            return String.valueOf(str.charAt(minIndex));
        }
    }
    
}
