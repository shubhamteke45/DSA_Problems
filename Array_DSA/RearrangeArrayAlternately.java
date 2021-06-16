class Solution{
    
   
    public static void rearrange(int arr[], int n){
        
        int[] temp = new int[n];
        int i=0, j=n-1, k=0;
        while(k<=j){
            if(i%2==0){
                temp[i]=arr[j];
                j--;
            }
            else if(i%2!=0){
                temp[i]=arr[k];
                k++;
            }
            i++;
        }
        
        for(int s=0;s<n;s++){
            arr[s]=temp[s];
        }
        
    }
    
}