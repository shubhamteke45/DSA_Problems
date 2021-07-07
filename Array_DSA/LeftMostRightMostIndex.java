/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    public pair indexes(long v[], long x)
    {
        long n= v.length;
        int first=-1, last=-1;
        for(int i=0;i<n;i++){
            if(x!=(int)v[i]){
                continue;
            }
            if(first==-1){
                first=i;
            }
            last=i;
        }
        return new pair(first, last);
    }
}
