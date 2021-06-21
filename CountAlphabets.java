package String;

public class CountAlphabets {

	public static void main(String[] args) {
		
		String s = "abcd%$123";
		char temp[] = s.toCharArray();
        int len=temp.length;
        for(int i=0;i<temp.length;i++){
            if(Character.isDigit(temp[i]) || temp[i]=='@'|| temp[i]=='#'|| 
            temp[i]=='$'|| temp[i]=='&'|| temp[i]=='!'|| temp[i]=='%'|| temp[i]=='^'|| temp[i]=='*')
            {
                len--;
            }
        }
        
        System.out.println(len);
	}

}
