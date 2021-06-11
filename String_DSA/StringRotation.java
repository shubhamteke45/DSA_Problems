package String;

public class StringRotation {

	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2 = "bacd";
		int flag=0;
		
		
		
		for(int i=0; i<s1.length()-1; i++) {
			int c = s2.indexOf(s1.charAt(i));
			
			if(c==s1.length()-1) {
				c=-1;
			}
			if(s1.charAt(i+1) == s2.charAt(c+1)) {
				flag=1;
			}
			else {
				flag=0;
				break;
			}
		}
		System.out.println(flag);
	}

}
