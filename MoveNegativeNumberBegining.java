package DSA;

public class MoveNegativeNumberBegining {

	public static void main(String[] args) {
		
		int[] arr = {-12,11,-13,-5,6,-7,5,-3,-6};
		int[] a = new int[9];
		int n=9,low=0, high=n-1,i=0;
		
		while(i<n) {
			if(arr[i]<0) {
				a[low]= arr[i];
				low++;
				i++;
			}
			else {
				a[high]=arr[i];
				high--;
				i++;
			}
		}
		
		for(int k=0; k<9; k++) {
			System.out.print(a[k]+" ");
		}

	}

}
