package Array;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		
		int index=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[index++]=arr[i+1];
			}
		}
		System.out.println(index);
	}

}
