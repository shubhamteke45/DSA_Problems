package String;

public class StringPalindrom {

	public static void main(String[] args) {
		
		String s="ass";
		
		int i=0, n=s.length()-1;
		
		while(i<n) {
			if(s.charAt(i) == s.charAt(n)) {
				i++;
				n--;
			}
			else {
				break;
			}
		}
		if(i>=n) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
