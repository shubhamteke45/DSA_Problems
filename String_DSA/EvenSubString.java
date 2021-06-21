package String;

public class EvenSubString {

	public static void main(String[] args) {
		
		String s = "1234";
		int len = s.length();
		int i=len-1;
		int cn=0;
		while(i>=0) {
			int n = s.charAt(i)-'0';
			if(n%2==0) {
				cn+=i+1;
			}
			i--;
		}
		
		System.out.println(cn);
	}

}
