package lesson5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ClassTest /*extends java.lang.Object*/ implements Cloneable {
	private int x = 10;

	private void print(int y) {
		System.err.println("CALL!!!!!!!"+y);
	}

	void print(double y) {
		System.err.println("CALL!!!!!!!"+y);
	}
	
//	public ClassTest() {}
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		ClassTest	ct = new ClassTest();
		Class		cl = ct.getClass();
		
		System.err.println("Name="+cl.getName());
		System.err.println("Canonical name="+cl.getCanonicalName());
		System.err.println("Simple name="+cl.getSimpleName());
		
		System.err.println("Fields="+Arrays.toString(cl.getDeclaredFields()));
		System.err.println("Superclass="+cl.getSuperclass());
		
		System.err.println("Methods="+Arrays.toString(cl.getDeclaredMethods()));
		
		System.err.println("Constructors="+Arrays.toString(cl.getConstructors()));
		
		System.err.println("Interfaces: "+Arrays.toString(cl.getInterfaces()));

		System.err.println("isArray: "+cl.isArray());
		System.err.println("isInterface: "+Cloneable.class.isInterface());
		System.err.println("isPrimitive: "+int.class.isPrimitive());
		System.err.println("isPrimitive: "+cl.isPrimitive());
		System.err.println("isInstance: "+cl.isInstance(ct)); // ct instanceof ClassTest
		
		Field	f = cl.getDeclaredField("x");
		
		System.err.println("Field name: "+f.getName());
		System.err.println("Field type: "+f.getType());
		System.err.println("is public? "+Modifier.isPublic(f.getModifiers()));
		System.err.println("is static? "+Modifier.isStatic(f.getModifiers()));

		System.err.println("Field value: "+f.getInt(ct));
		f.setInt(ct,20);	// ct.x = 20;
		System.err.println("New Field value: "+ct.x);
		
		Method	m = cl.getDeclaredMethod("print",int.class);
		
		System.err.println("Method name: "+m.getName());
		System.err.println("Return type: "+m.getReturnType());
		System.err.println("Parameters: "+Arrays.toString(m.getParameters()));
		
		m.invoke(ct,12345);	// ct.print(12345);
		
		Constructor	c = cl.getDeclaredConstructor();
		System.err.println("Constructor Parameters: "+Arrays.toString(c.getParameters()));
		
		ClassTest	newCt = (ClassTest)c.newInstance();
		System.err.println("X="+newCt.x);
	}
}
