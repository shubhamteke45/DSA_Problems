package Array;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 3, 6};
		int x=10, n=5;
		int l,r;
		boolean ans = false;
		
		for(int i=0;i<n-2;i++) {
			l=i+1;
			r=n-1;
			while(l<r) {
				if(arr[i]+arr[l]+arr[r]==x) {
					ans=true;
					break;
				}
				
				else if(arr[i]+arr[l]+arr[r]<x) {
					l++;
				}
				else {
					r--;
				}
			}
			
			if(ans==true) {
				break;
			}
		}
		
		System.out.println(ans);
	}

}
