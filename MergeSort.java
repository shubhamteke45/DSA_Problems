package DSA;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = {9,4,6,7,1,3,2};
		
		mergeSort(arr,0,6);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void mergeSort(int[] arr, int l, int r) {
		
		if(l<r) {
			int mid = (l+r)/2;
			
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
		
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		
		int i=l;
		int j=mid+1;
		int k=l;
		int[] temp = new int[arr.length]; 
		
		while(i<=mid && j<=r) {
			if(arr[i]<arr[j]) {
				temp[k]=arr[i];
				i++;
			}
			else {
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		
		if(i>mid) {
			while(j<=r) {
				temp[k]=arr[j];
				k++;
				j++;
			}
		}
		else {
			while(i<=mid) {
				temp[k]=arr[i];
				i++;
				k++;
			}
		}
		
		for(int s=l;s<=r;s++) {
			arr[s] = temp[s];
		}
	}

}
