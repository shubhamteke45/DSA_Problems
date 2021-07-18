class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int arr[][], int r, int c)
    {
        ArrayList<Integer> res = new ArrayList<>();
        
        int minr=0, minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int tne = r*c;
        int cn=0;
        
        while(cn<tne){
            //top wall
            for(int i=minr, j=minc; j<=maxc && cn<tne; j++){
                res.add(arr[i][j]);
                cn++;
            }
            minr++;
            
            //right wall
            for(int i=minr, j=maxc; i<=maxr && cn<tne; i++){
                res.add(arr[i][j]);
                cn++;
            }
            maxc--;
            
            //bottom wall
            for(int i=maxr, j=maxc; j>=minc && cn<tne; j--){
                res.add(arr[i][j]);
                cn++;
            }
            maxr--;
            
            //right wall
            for(int i=maxr, j=minc; i>=minr && cn<tne; i--){
                res.add(arr[i][j]);
                cn++;
            }
            minc++;
        }
        
        return res;
    }
}
