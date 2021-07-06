package SortingAlgorithms;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {5,4,1,2,7,0,3,6,8};
		int n=arr.length;
		quickSort(arr,0,arr.length-1);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}
	
	public static int partition(int[] arr, int l, int r) {
		
		int pivote=arr[l];
		int j=r;
		int i=l+1;
		while(i<j) {
			while(arr[i]<=pivote) i++;
			while(arr[j]>pivote) j--;
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[l];
		arr[l]=arr[j];
		arr[j]=temp;
		return j;
	}
	
	public static void quickSort(int[] arr, int l, int r) {
		if(l<r) {
			int pivote=partition(arr,l,r);
			quickSort(arr,l,pivote-1);
			quickSort(arr,pivote+1, r);
		}
	}

}
