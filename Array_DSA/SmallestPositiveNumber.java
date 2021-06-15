package Array;

import java.util.Arrays;

public class SmallestPositiveNumber {

	public static void main(String[] args) {
		
		int[] arr = {5,1,0,3,6,9,7,2};
		
		int n=arr.length;
		
		int res = smallestMissing(arr, n);
		
		System.out.println(res);
	}

	private static int smallestMissing(int[] arr, int n) {
		
		int ans=-1;
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
			if(arr[i]>=0) {
				if(arr[i+1] != arr[i]+1) {
					ans=arr[i]+1;
					break;
				}
			}
		}
		
		if(ans==-1) {
			ans=arr[n-1]+1;
		}
		return ans;
	}

}
