class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        int cn0=0;
        int max0=0;
        int ans=0;
        
        for(int j=0;j<N;j++){
            cn0=0;
            for(int i=0;i<N;i++){
                if(arr[i][j]==0){
                    cn0++;
                }
            }
            if(cn0>max0){
                max0=cn0;
                ans=j;
            }
        }
        
        return ans;
    }
}
