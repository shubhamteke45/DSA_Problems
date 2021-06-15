package Array;

public class Subarray_1_0 {

	public static void main(String[] args) {
		
		int[] arr = {1,0,0,1,0,1,1};
		int n=arr.length;
		
		int i=0, j=0;
		int cn0=0, cn1=0;
		while(i<n) {
			if(arr[i]==0) {
				cn0++;
			}
			else if(arr[j]==1) {
				cn1++;
			}
		}
	}

}
