package DSA;

public class MaxSumSubArray {

	public static void main(String[] args) {

		int[] arr= {1,2,3,-5,6,-2,9,-8,3,-1};
		int n=arr.length;
		maxSum(arr, n);
		

	}
	
	public static void maxSum(int[] arr, int n) {
		
		int maxh=0, maxf=Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			maxh+=arr[i];
			maxf=Integer.max(maxh, maxf);
			if(maxh<0) {
				maxh=0;
			}
		}
		System.out.println(maxf);
	}
}
