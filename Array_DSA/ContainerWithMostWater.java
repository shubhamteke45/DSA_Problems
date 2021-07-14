class Solve{
    
    long maxArea(int A[], int len){
        
        int i=0;
        int j=len-1;
        int maxWater=0;
        while(i<j){
            int height = Math.min(A[i], A[j]);
            int width = j-i;
            
            maxWater = Math.max(maxWater, height*width);
            
            if(A[i]<=A[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
    }
    
}
