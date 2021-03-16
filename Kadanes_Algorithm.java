package DSA;

public class Kadanes_Algorithm {

	public static void main(String[] args) {

	/*
	 * Brute Force approach
		int[] a= {-1,-2,-3,-4};
		int max_sum=-100; 
		
		for(int i=0; i<a.length; i++)
		{
			int sum=a[i];
			if(max_sum < sum)
			{
				max_sum = sum;
			}
			for(int j=i+1; j<a.length; j++)
			{
				sum+=a[j];
				if(max_sum < sum)
				{
					max_sum = sum;
				}
			}
		}
		System.out.println("Max Sum is: "+max_sum);
	*/
		
		int[] a= {-1,-2,-3,-4};
		
		int max_sum=Integer.MIN_VALUE;
		int current_sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			current_sum += a[i];
			
			if(current_sum > max_sum)
			{
				max_sum = current_sum;
			}
			
			if(max_sum < 0)
			{
				max_sum=0;
			}
		}
		System.out.println("max sum: "+max_sum);
	}

}
