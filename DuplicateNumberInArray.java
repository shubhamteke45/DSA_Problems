package DSA;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		
		int[] arr= {1,1,3,4,2,2};
		int n=arr.length;
		
		for(int i=0; i<n; i++)
		{
			arr[arr[i]%n] = arr[arr[i]%n] + n;
		}
		
		for(int i=0; i<n; i++)
		{
			if(arr[i]/n > 1) 
			{
				System.out.println(i);
			}
		}

	}

}
