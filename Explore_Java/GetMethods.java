package OOP;
import java.lang.reflect.*;

public class GetMethods {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String");
		Method[] m = c.getDeclaredMethods();
		for(Method m1:m) {
			System.out.println(m1.getName());
		}
	}

}


