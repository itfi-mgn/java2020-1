package lesson6;

import java.util.Arrays;

@MyAnnotation("my text")
public class SpecialClassTest {
	public static int	x = 10;

	public int			y = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class	cl = InnerClass.class;
		
		System.err.println("Constr: "+Arrays.toString(cl.getDeclaredConstructors()));
		System.err.println("Fields: "+Arrays.toString(cl.getDeclaredFields()));
		
		SpecialClassTest	sct = new SpecialClassTest();
		InnerClass			ic = sct.new InnerClass();	// new InnerClass(new SpecialClassTest());
		InnerClass			ic1 = sct.new InnerClass();	// new InnerClass(new SpecialClassTest());
		
		final int			ttt = 10 + x;
		MyInterface			anon = new MyImplementation();
		MyInterface			anon2 = new MyInterface() {
									public static final int z = 20;
									private int q = 20;
									// private final int val$ttt;
									//SpecialClassTest$1(int ttttt){val$ttt = ttttt;}
									{
										System.err.println("creatte anon!!!!");
									}
									
									@Override
									public void abcde() {
										System.err.println("sdkfjkodjkdjf"+x+" "+/*val$ttt*/ttt);
									}
							};
		Class				clAnon = anon2.getClass();
		
		System.err.println("Name="+clAnon.getName());
		System.err.println("Constructors="+Arrays.toString(clAnon.getDeclaredConstructors()));
		System.err.println("Fields="+Arrays.toString(clAnon.getDeclaredFields()));
		
		MyInterface			anon3 = new MyInterface() {
									@Override
									public void abcde() {
										System.err.println("sdkfjkodjkdjf");
									}
							};
		System.err.println("Name(3)="+anon3.getClass().getName());

		call(anon3);
		call(new MyInterface() {
			@Override
			public void abcde() {
				System.err.println("mswjklsdjklwei8u");
			}
		});
		call(/*SpecialClassTest::methodZZZ*/()->{System.err.println("123456");});
		call(SpecialClassTest::zzz);
		
		Class	myClass = SpecialClassTest.class;
		
		System.err.println("Methods: "+Arrays.toString(myClass.getDeclaredMethods()));
		System.err.println("Ann: "+((MyAnnotation)myClass.getAnnotation(MyAnnotation.class)).value());
		
		
		MyEnum	enumVar = MyEnum.MONDEY;
		
		if (enumVar == MyEnum.THURSDAY) {
			
		}
		switch (enumVar) {	// enumVar.ordinal()
			case FRIDAY:	// FRIDAY.ordinal() --> 5
				break;
			case MONDEY:	// MONDEY.ordinal() --> 1
				break;
			case SATURDAY:
				break;
			case SUNDAY:
				break;
			case THURSDAY:
				break;
			case TUESDAY:
				break;
			case WEDNESDAY:
				break;
			default:
				break;
		}
	}
	
	static void call(final MyInterface myVar) {
		System.err.println("----- call start");
		myVar.abcde();
		System.err.println("----- call end");
	}
	
//	private static synthetic void lambda$0() {System.err.println("123456");}

	private static void zzz() {}
	
	private class InnerClass {
		static final int	a = 10;		// ConstValue
//		static int			b = 10;		// <clinit>
		// private final SpecialClassTest this$0;
		// private InnerClass(SpecialClassTest z) {
		//		this$0 = z;
		// }
		int y;
		
		public void print() {
			System.err.println("X="+x+", Y="+/*this$0.*/y);
		}
		
		private class XXXXXX{
			public void print() {
				System.err.println("X="+x+", Y="+/*this$0.*/SpecialClassTest.this.y);
			}
		}
	}
}

@FunctionalInterface
interface MyInterface {
	void abcde();
	default void www() {
	}
}

class MyImplementation implements MyInterface {

	@Override
	public void abcde() {
		System.err.println("sdkfjkodjkdjf");
	}
	
}


