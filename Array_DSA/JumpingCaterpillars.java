package Array;

import java.util.HashSet;
import java.util.Set;

public class JumpingCaterpillars {

	public static void main(String[] args) {
		
		long[] arr = {2,3,5};
		int n=10;
		int k=arr.length;
		
		Set<Integer> set = new HashSet<>();
        for(int i=1;i<=n;i++){
            set.add(i);
        }
        
        int i=0;
        while(i<k) {
        	long divisor=arr[i];
            int j=1;
            while(j<=n){
                if(j%divisor==0 && set.contains(j)){
                    set.remove(j);
                }
                j++;
            }
            i++;
        }
        
        for(int a:set) {
        	System.out.print(a+" ");
        }
	}

}
