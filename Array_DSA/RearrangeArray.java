package Array;
import java.util.*;

public class RearrangeArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4};
		int n=arr.length;
		Arrays.sort(arr);
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        int i=0,j=n-1,s=0;
        while(i<n){
            if(i%2==0){
                arr[i]=temp[s];
                s++;
            }
            else{
                arr[i]=temp[j];
                j--;
            }
            i++;
        }
		
		for(int k=0;k<n;k++) {
			System.out.println(arr[k]+"");
		}

	}

}
