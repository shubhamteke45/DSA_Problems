class GFG
{
    static void rotate(int arr[][]) 
    {
        
        //transpose the matrix
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        //rotate the rows 
        for(int i=0;i<arr[0].length;i++){
            int lr = 0;
            int hr = arr.length-1;
            while(lr<hr){
                int temp = arr[lr][i];
                arr[lr][i] = arr[hr][i];
                arr[hr][i] = temp;
                lr++;
                hr--;
            }
        }
    }
}
