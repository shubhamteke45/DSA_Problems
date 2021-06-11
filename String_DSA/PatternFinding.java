package String;

public class PatternFinding {

	public static void main(String[] args) {
		
		String str = "AABAACAADAABAAABAA";
		String pat = "AABA";
		
		search(str, pat);
	}

	private static void search(String str, String pat) {
		
		int n = str.length();
		int m = pat.length();
		
		for(int i=0;i<n-m; i++) {
			
			int j;
			for(j=0;j<m;j++) {
				if(str.charAt(i+j) != str.charAt(j)) {
					break;
				}
			}
			
			if(j==m) {
				System.out.println("Pattern found at index "+i);
			}
		}
	}

}
