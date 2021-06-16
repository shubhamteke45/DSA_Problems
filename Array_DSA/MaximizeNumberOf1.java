class Solve {
    
    int findZeroes(int arr[], int n, int m) {
        
        int maxCount=0;
        int zeroCount=0, start=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroCount++;
            }
            
            while(zeroCount>m){
                if(arr[start]==0){
                    zeroCount--;
                }
                start++;
            }
            
            maxCount = Math.max(maxCount, i-start+1);
        }
        
        return maxCount;
    }
}