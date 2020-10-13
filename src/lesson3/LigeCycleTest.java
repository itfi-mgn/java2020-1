package lesson3;

public class LigeCycleTest /* extends java.lang.Object */ {
	public static final int		x = 10;				//	"ConstValue" 
	public static final double	y = Math.random();	//  "Code"
	
	// static void <clinit>() {
	// 	y = Math.random();  1 step
	//  System.err.println("URA!!!!!");
	//  System.err.println("URA!!!!! wwww");
	// }

	static {	// 2 step
		System.err.println("URA!!!!!");
	}

	// public LigeCycleTest(){	 "<init>"
	//		super();
	//      z = 20;
	//		System.err.println("Into constructor");
	// }
	
	int	z = 20;
	
	{
		System.err.println("Into constructor");
	}

	public LigeCycleTest(){
		super();
		// z = 20;
		// System.err.println("Into constructor");
		System.err.println("Into constructor z="+z);
	}
	
	public static void staticPrint() {
		System.err.println("Life cycle static");
	}
	
	public void itemPrint() {
		System.err.println("Life cycle item");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world");
		
		LigeCycleTest	item = new LigeCycleTest();
		
		/*item.*/LigeCycleTest.staticPrint();
		item.itemPrint();
		
		item = null;
		
	}
}
