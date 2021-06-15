package Array;

public class Range_Addition {

	public static void main(String[] args) {

		int N = 6;
		 
        int arr[] = new int[N];
 
        // Range add Queries
        add(arr, N, 0, 2, 100);
        add(arr, N, 1, 5, 100);
        add(arr, N, 2, 3, 100);
 
        printArr(arr, N);
		
	}

	private static void printArr(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void add(int[] arr, int n, int i, int j, int k) {
		
		for(int s=i;s<=j;s++) {
			arr[s]+=k;
		}
	}

}
