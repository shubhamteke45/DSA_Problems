package String;

public class ReverseString {

	public static void main(String[] args) {

		char s[] = {'s', 'h', 'u'};
		int i=0, n=s.length-1;
		while(i<n) {
			char temp = s[i];
			s[i]=s[n];
			s[n]=temp;
			i++;
			n--;
		}
		
		System.out.println(s);
	}

}
