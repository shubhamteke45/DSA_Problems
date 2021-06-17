package SortingAlgorithms;

public class SelectionSort {

	//Time complexity = O(n^2)
	//space complexity = O(1)
	public static void main(String[] args) {
		int[] arr = {4,3,7,1,5,2,10,8,6,9};
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			
			if(min!=i) {
				swap(arr, min, i);
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void swap(int[] arr, int min, int i) {
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
	}

}
