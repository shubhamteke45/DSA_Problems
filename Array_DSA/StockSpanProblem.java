class Solution
{
    
    public static int[] calculateSpan(int price[], int n)
    {
        int[] span = new int[n];
        
        span[0]=1;
        
        int i=1, j=0, cn=1;
        while(i<n){
            if(price[i-1]<price[i]){
                int elm=price[i];
                cn=1;
                j=i-1;
                while(j>=0){
                    if(price[j]<elm){
                        cn++;
                        j--;
                    }
                    else{
                        break;
                    }
                }
                span[i]=cn;
            }
            
            else{
                span[i]=1;
            }
            i++;
        }
        
        return span;
    }
    
}