package SortingAlgorithms;

public class BubbleSort {

	//Time complexity = O(n^2)
	//space complexity = O(1)
	public static void main(String[] args) {
		
		int[] arr = {4,3,7,1,5,2,10,8,6,9};
		int n=arr.length;
		for(int i=0;i<n-1;i++) 
			for(int j=0;j<n-i-1;j++) {
				if(arr[j+1] < arr[j]) {
					swap(arr, j+1, j);
				}
			}
		
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void swap(int[] arr, int i, int j) {
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
