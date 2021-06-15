package Array;

public class Search_Infinite_Sorted_Array {

	public static void main(String[] args) {
		
		//very big sorted array 
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20,25,26,27,29
				,31,36,39,40,41,42,43,45,46,47,48,49,50};
		
		int low=0;
		int key=46;
		int high=1;
		while(arr[high]<key) {
			low=high;
			high=2*high;
		}
		
		System.out.println(binarySearch(arr,low,high,key));
		
	}

	private static int binarySearch(int[] arr, int low, int high, int key) {
		
		while(low<high) {
			int mid = (low+high)/2;
			if(mid==key) {
				return -1;
			}
			else if(key<arr[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
	}
}
