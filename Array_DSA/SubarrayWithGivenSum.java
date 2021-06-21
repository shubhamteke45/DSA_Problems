package Array;

import java.util.HashMap;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		
		int[] arr = {10,15,-5,15,-10,5};
		int start=0, end=-1;
		int  curSum=0, sum=20;
		
		HashMap<Integer, Integer> mp = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			curSum+=arr[i];
			
			if(curSum-sum == 0) {
				start=0;
				end=i;
				break;
			}
			else if(mp.containsKey(curSum-sum)) {
				start = mp.get(curSum-sum)+1;
				end=i;
				break;
			}
			mp.put(curSum, i);
		}
		
		if(end==-1) {
			System.out.println("There is no sub-array with given sum");
		}
		else {
			System.out.println("Sub-array from "+start+" to "+end);
		}

	}

}
