package SortingAlgorithms;

public class InerationSort {

	//Time complexity = O(n^2) in worst and avg case
	//				  = O(n) in best case
	//space complexity= O(1)
	public static void main(String[] args) {
		
		int[] arr = {4,3,7,1,5,2,10,8,6,9};
		int n=arr.length;
		
		for(int i=1;i<n;i++) {
			int temp=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=temp;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
