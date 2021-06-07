package Array;

public class CountZeros {

	public static void main(String[] args) {
		
		int[] arr = {1,1,1,1,0,0,0};
		int n=arr.length;
		int res = countZeroes(arr,n);
		System.out.println(res);
	}
	
	public static int countZeroes(int[] arr, int n) {
        
        if(arr[0]==0){
            return n;
        }
        else if(arr[n-1]==0){
            int i=n-2;
            int cn=1;
            while(arr[i]!=1){
                i--;
                cn++;
            }
            return cn;
        }
        else{
            return 0;
        }
    }


}
