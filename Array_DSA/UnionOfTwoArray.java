package Array;
import java.util.*;

public class UnionOfTwoArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,8,9};
		int m=5, n=5, x=8;
		
		Set<Integer> hashSet = new HashSet<Integer>();
		for(int i=0; i<m; i++) {
			int s=a[i];
			hashSet.add(s);
		}
		
		for(int i=0; i<n; i++) {
			int d=b[i];
			hashSet.add(d);
		}
		
		System.out.println(hashSet);
	}

}
