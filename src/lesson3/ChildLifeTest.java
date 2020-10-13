package lesson3;

public class ChildLifeTest extends LigeCycleTest {
	public static final int		x = 40;
	public static final double	y = Math.random();
	
	static {
		System.err.println("Child call!!!!!");
	}
	
	// static <clinit>(){....}

	static int	t = 12345;
	
	int	z = t++;
	{
		System.err.println("Child constructor z="+this./*lesson3.ChildLifeTest.*/z);
	}
	
	public static void staticPrint() {
		System.err.println("Child life cycle static");
	}
	
	@Override
	public void itemPrint(/*this*/) {
		System.err.println("Child life cycle item z="+this.z);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world x="+/*lesson3.ChildLifeTest.*/x);
		
		LigeCycleTest	item = new ChildLifeTest();	// invokespecial  noVMT, this
		LigeCycleTest	item1 = new ChildLifeTest();
		
		item.staticPrint();			// invokestatic		noVMT, noThis
		item.itemPrint(/*item*/);	// invokevirtual, invokeinterface VMT, this 
		item1.itemPrint(/*item1*/);
		
	}
}
