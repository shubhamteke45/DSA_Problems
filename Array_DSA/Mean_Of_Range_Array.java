package Array;

import java.util.ArrayList;

public class Mean_Of_Range_Array {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		int[] que = {0, 2, 1, 3, 0, 4};
		
		int n=arr.length;
		int q = que.length;
		
		ArrayList<Integer> al = new ArrayList<>();
        
        int i=0, j=1;
        int cn=0;
        int sum=0, res=0;
        
        while(j<q){
            int l = que[i];
            int r = que[j];
            cn = (r-l)+1;
            for(int k=l;k<=r;k++){
                sum+=arr[k];
            }
            
            res = sum/cn;
            al.add(res);
            //System.out.println(res);
            j+=2;
            i+=2;
            sum=0;
            cn=0;
            res=0;
        }
        
        for(int elm:al) {
        	System.out.print(elm+" ");
        }
	}

}
