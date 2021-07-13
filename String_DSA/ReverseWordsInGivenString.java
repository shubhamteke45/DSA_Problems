class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        int n = s.length();
		char ch = '.';
		int i=n-1, j=n-1;
		String res = "";
		String temp = "";
		while(i>0 && j>0) {
			int ans = Character.compare(s.charAt(j), ch);
			if(ans==0) {
				temp = temp.concat(s.substring(j+1, i+1));
				temp = temp.concat(".");
				i=j-1;
			}
			j--;
		}
		
		if(res.length()!=n) {
			res = res.concat(temp);
			res = res.concat(s.substring(0, i+1));
		}
		
		return res;
    }
}
