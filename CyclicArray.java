package DSA;

public class CyclicArray {

	public static void main(String[] args) {
		
		int A[]= {1,2,3,4,5};
		int n=5, low=0, high=n-1, i=0;
		
		if(n%2==0) {
			while(low<high) {
				int temp=A[low];
				A[low] = A[high];
				A[high] = temp;
				low++;
				high--;
			}
		}
		
		else {
			while(low<high) {
				int temp=A[low];
				A[low] = A[high];
				A[high] = temp;
				low++;
				high--;
			}
		}
		
		for(i=0; i<n; i++) {
			System.out.println(A[i]);
		}

	}

}
