package String;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		
		String s = "shubham";
		char ch[] = s.toCharArray();
	    Arrays.sort(ch);
	    String str = new String(ch);
	    System.out.println(str);
	    
	}

}
