package String;

public class IncreasingSubstring {

	public static void main(String[] args) {
		
		String s = "ABACDA";
		int n=s.length();
		
		int[] ch = new int[n];
		ch[0]=1;
		
		
		for(int i=1;i<n;i++) {
			
			if(s.charAt(i) > s.charAt(i-1)) {
				int cn=1;
				int k=i;
				while(k>=1) {
					if(s.charAt(k) > s.charAt(k-1)) {
						cn++;
						k--;
					}
					else {
						k=0;
					}
				}
				ch[i]=cn;
			}
			else {
				ch[i]=1;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(ch[i]+" ");
		}
	}

}
