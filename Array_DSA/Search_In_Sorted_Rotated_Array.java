package Array;

public class Search_In_Sorted_Rotated_Array {

	public static void main(String[] args) {

		int[] arr = {20,30,40,50,60,5,10};
		int key=5;
		
		//if answer is -1 then we can key is note present in array.
		System.out.println(searchKey(arr, key));
		
	}

	private static int searchKey(int[] arr, int key) {
		int low=0, high=arr.length-1;
		int res=-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				res = mid;
			}
			
			if(arr[low]<arr[mid]) {
				if(arr[low]<=key && arr[mid]>key) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}
			else {
				if(arr[mid]<key && arr[high]>=key) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
			}
		}
		return res;
	}

}
