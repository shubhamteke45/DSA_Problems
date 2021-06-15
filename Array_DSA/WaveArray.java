package Array;

public class WaveArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int n=arr.length;
		
		if(n%2==0){
            for(int i=0;i<n-1;i+=2){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]=temp;
            }
        }
        else{
            for(int i=0;i<n-2;i+=2){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]=temp;
            }
        }
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
