package lesson2;

public class ObjectTest {
	public static String	sss = "ab";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*java.lang.*/Object	obj = new Object();
		
		Class<? extends Object> y = obj.getClass();
		System.err.println("Obj="+obj.toString());
		String	s = "abc", s1 = sss+"c";
		System.err.println("String="+s.toString());
		if (s.equals(s1)) {
			System.err.println("Equals");
		}
		else {
			System.err.println("Not equals");
		}
		
		obj = 3.14;	// obj = Integer.valueOf(3);
		
		Integer	x1 = 10, x2 = 20, x3 = x1 + x2;
		// Integer x1 = Integer.valueOf(10), x2 = Integer.valueOf(20)
		//			x3 = Integer.valueOf(x1.intValue()+x2.intValue());
		
		java.lang.Number	n;
//		byte 
		java.lang.Byte	b;
//		short 
		java.lang.Short	sh;
//		int 
		java.lang.Integer	i;
//		long 
		java.lang.Long	L;
//		float 
		java.lang.Float	f;
//		double 
		java.lang.Double d;
		
//		boolean 
		java.lang.Boolean z; 
//		char 
		java.lang.Character	c;

	}
}
