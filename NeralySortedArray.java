package Array;
import java.util.*;
import java.lang.*;
public class NeralySortedArray {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] arr = new int[n];
		    
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    
		    PriorityQueue<Integer> pq = new PriorityQueue<>();
		    for(int i=0;i<=k;i++) {
		    	pq.add(arr[i]);
		    }
		    
		    for(int i=k+1;i<n;i++) {
		    	System.out.print(pq.remove()+" ");
		    	pq.add(arr[i]);
		    }
		    
		    while(pq.size()>0) {
		    	System.out.print(pq.remove()+" ");
		    }
		}
	}

}
