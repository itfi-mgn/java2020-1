package lesson4;

public abstract class InterfaceTest /*extends*/ implements Total {
//	/*public static final*/ String	FIELD = "abcde";

	@Override
	public void myMethod() {
	}

	public void www() {
		// dklfjdklfjkldjfkljdf
	}
	
	public abstract void print();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTest	it = new ChildInterfaceTest();
		System.err.println("F="+FIELD);
		
		
	}
	
	public static void m(InterfaceTest t) { // Total
		t.myMethod();	// invokevirtual	// invokeinterface 
	}
}

interface Total extends MyInterface, MyInterface2 {
	static void printStatic() {	// 1.8
		
	}
	
	default void eeee() {	// 1.8
		
	}
	
	private void x() {	// 9
		
	}
}

/* abstract */ interface MyInterface {	
	/*public static final*/ String	FIELD = "abcde";
	/*public*/ void myMethod();
	void a();
}

/* abstract */ interface MyInterface2 {	
	/*public*/ void myMethod2();
	void a();
}

class ChildInterfaceTest extends InterfaceTest {
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	public void abcde() {
		
	}

	@Override
	public void myMethod2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
}