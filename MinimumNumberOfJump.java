package DSA;

public class MinimumNumberOfJump {

	public static void main(String[] args) {
		
		int[] arr= {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int n=arr.length, temp=0, cn=0, i=0;
		
		if(arr[0]==0) 
		{
			System.out.println(0);
		}
		else
		{
			while(i<n)
			{
				temp=arr[i];
				cn++;
				i+=temp;
				if(n<=arr[temp]) 
				{
					i=n;
				}
			}
			
			System.out.println(cn);
		}
		
		

	}

}
