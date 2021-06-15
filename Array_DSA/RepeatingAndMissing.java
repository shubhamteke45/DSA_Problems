package Array;

import java.util.Arrays;

public class RepeatingAndMissing {

	public static void main(String[] args) {
		
		int arr[] = {4, 3, 6, 2, 1, 1};
		int i=0;
		Arrays.sort(arr);
		while(i<arr.length-1) {
			if(arr[i]==arr[i+1]) {
				System.out.println("Repeating "+arr[i]);
				i++;
			}
			else if(arr[i]+1 != arr[i+1]) {
				int a=arr[i]+1;
				System.out.println("Missing "+a);
				i++;
			}
			else {
				i++;
			}
		}
	}

}
