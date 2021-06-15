package Array;

import java.util.ArrayList;


public class CompletingTasks {

	public static void main(String[] args) {
		
		int[] arr = {2, 5, 6, 7, 9, 4};
		int n=15, m=arr.length;
		
		ArrayList<Integer> set = new ArrayList<>();
		
		for(int i=1;i<=n;i++) set.add(i);
		
		for(int i=0;i<m;i++) {
			int index = set.indexOf(arr[i]);
			set.remove(index);
		}
		
		for(int i=0;i<set.size();i++) {
			System.out.print(set.get(i)+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<set.size();i+=2) {
			System.out.print(set.get(i)+" ");
		}
		
		System.out.println();
		
		for(int i=1;i<set.size();i+=2) {
			System.out.print(set.get(i)+" ");
		}

	}

}
