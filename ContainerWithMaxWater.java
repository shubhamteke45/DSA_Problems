package Array;

public class ContainerWithMaxWater {

	public static void main(String[] args) {
		
		
		int[] height = {1,8,6,2,5,4,8,3,7};
		int res = maxArea(height);
		System.out.println(res);
	}

	private static int maxArea(int[] height) {
		
		int n=height.length-1;
        int l=0, r=n, sum=0;
        
        while(l<r){
            int h=Math.min(height[l],height[r]);
            sum=Math.max(sum, h*(r-l));
            while(height[l]<=h && l<r) l++;
            while(height[r]<=h && l<r) r--;
        }
        return sum;
	}

}
