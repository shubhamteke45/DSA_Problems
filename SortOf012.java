package DSA;

public class SortOf012 {

	public static void main(String[] args) {
		
		int arr[] = {0,2,1,2,0};
		int n=5;
		
		int low=0, high=n-1, mid=0;
		
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}
			
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				int temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

}


