package SortingAlgorithms;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {4,3,7,1,5,2,10,8,6,9};
		
		int n=arr.length;
		
		mergeSort(arr, 0, n-1);
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

	private static void mergeSort(int[] arr, int l, int r) {
		
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			sort(arr, l, mid, r);
		}
	}

	private static void sort(int[] arr, int l, int mid, int r) {
		
		int i=l;
		int j=mid+1;
		int k=l;
		int[] temp = new int[arr.length];
		
		while(i<=mid && j<=r) {
			if(arr[i]<arr[j]) {
				temp[k]=arr[i];
				i++;
			}
			else{
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		
		if(i>mid) {
			while(j<=r) {
				temp[k]=arr[j];
				j++;
				k++;
			}
		}
		else {
			while(i<=mid) {
				temp[k] = arr[i];
				i++;
				k++;
			}
		}
		
		for(int s=l;s<=r;s++) {
			arr[s] = temp[s];
		}
	}

}
