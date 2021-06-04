package Array;

public class Plus_One {

	public static void main(String[] args) {
		
		int[] arr = {9};
		
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i]!=9) {
				arr[i]++;
				break;
			}
			else {
				arr[i]=0;
			}
		}
		
		if(arr[0]==0) {
			int[] res = new int[arr.length+1];
			res[0]=1;
			System.out.println(res);
		}
		else {
			System.out.println(arr);
		}
	}

}
