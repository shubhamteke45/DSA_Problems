package Array;

public class Count_Divisiors {

	public static void main(String[] args) {
		
		int[] arr = {2,4,6};
		int mul=1;
		int cn=1;
		
		for(int i=0;i<3;i++) {
			mul=mul*arr[i];
		}
		
		for(int i=1;i<mul;i++) {
			if(mul%i==0) {
				cn++;
			}
		}
		System.out.println(cn);
	}

}
