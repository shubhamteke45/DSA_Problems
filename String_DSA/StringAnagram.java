package String;
import java.util.*;

public class StringAnagram {

	public static void main(String[] args) {
		
		String s1 = "aab";
		String s2 = "aba";
		
		int n1 = s1.length();
		int n2 = s2.length();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();
		
		for(int i=0; i<c1.length; i++) {
			set1.add(c1[i]);
		}
		
		for(int i=0; i<c2.length; i++) {
			set2.add(c2[i]);
		}
		
		
		if(n1!=n2) {
			System.out.println("Not Anagrams");
		}
		else if(n1==n2) {
				if(set1.containsAll(set2)){
					System.out.println("is Anagram");
			}
		}
	}

}
