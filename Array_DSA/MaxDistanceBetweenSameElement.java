import java.util.HashMap;
import java.util.Map;

public class MaxDistanceBetweenSameElement {

	public static void main(String[] args) {
		
		int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
		int n = arr.length;
		int maxDif=0;
		Map<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			int temp=0;
			if(hm.containsKey(arr[i])) {
				temp = i-hm.get(arr[i]);
			}
			
			else {
				hm.put(arr[i], i);
			}
			
			if(maxDif<temp) {
				maxDif=temp;
			}
		}
		System.out.println(maxDif);
	}

}
