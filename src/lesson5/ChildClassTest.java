package lesson5;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ChildClassTest extends ClassTest {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		// TODO Auto-generated method stub
		ClassTest	ct = new ChildClassTest();
		Class		cl = ct.getClass();
		
		System.err.println("Name="+cl.getCanonicalName());
		
		Field	f = cl.getSuperclass().getDeclaredField("x");
		
		System.err.println("Field name="+f.getName());
		f.setAccessible(true);
		System.err.println("Field value="+f.getInt(ct));

		Method	m = cl.getSuperclass().getDeclaredMethod("print",int.class);
		
		m.setAccessible(true);
		m.invoke(ct, 12345);
		
	}
}
