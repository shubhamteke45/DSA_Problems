package Array;

public class RepeatedNumber {

	public static void main(String[] args) {
		
		int[] nums= {1,7,3,6,6,5};
		
		int n=nums.length;
		int sumi=nums[0], sumj=nums[n-1];
		int i=1, j=n-2;
		
		if(n==1) {
			System.out.println(nums[0]);
		}
		else {
			while(i<j) {
				if(sumi<sumj) {
					sumi+=nums[i];
					i++;
				}
				if(sumi>sumj) {
					sumj+=nums[j];
					j--;
				}
			}
			System.out.println(i);
		}

	}

}
