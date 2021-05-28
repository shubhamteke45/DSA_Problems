package String;

public class Long_Pressed_Name {

	public static void main(String[] args) {
		
		String name = "Shubham";
		String typed = "Shhuubbhhaaam";
		
		boolean result = isLongPressedName(name, typed);
		System.out.println(result);
	}

	private static boolean isLongPressedName(String name, String typed) {
		int i=0, j=0;
		while(i<name.length() && j<typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else if(i>0 && name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        
        while(j<typed.length()){
            if(name.charAt(i-1) != typed.charAt(j)) return false;
            j++;
        }
     return i<name.length() ? false: true;
	}

}
