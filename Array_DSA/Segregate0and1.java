package Array;

public class Segregate0and1 {

	public static void main(String[] args) {
		
		int[] arr = {0,0,0,1,1,1,0,1,0,1};
		int n=arr.length;
		segregate0and1(arr, n);
		
		
	}
	
	public static void segregate0and1(int[] arr, int n) {
        
        int i=0;
        int cn=0;
        while(i<n){
            if(arr[i]==1){
                cn++;
            }
        }
        
        if(cn<n){
            for(int j=0; j<n-cn; j++){
                arr[j]=0;
            }
            
            for(int j=n-cn;j<n;j++){
                arr[j]=1;
            }
        }
        for(int k=0;k<n;k++) {
			System.out.print(arr[k]+" ");
		}
    }

}
