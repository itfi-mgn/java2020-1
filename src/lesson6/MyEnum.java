package lesson6;

public /* final */ enum MyEnum /*extends java.lang.Enum */{
	/*public static final */ SUNDAY(/*"SUNDAY",0,*/100) /* = new MyEnum("SUNDAY",0) */,
	MONDEY(101),
	TUESDAY(102),
	WEDNESDAY(110),			// -- " -- 
	THURSDAY(122),
	FRIDAY(-2),
	/*public static final */ SATURDAY(100); /* = new MyEnum("SATURDAY",6) */
	
	private int x;
	
	MyEnum(/*String name, int ordinal*/int val) {
		// super(name,ordinal);
		this.x = val;
	}
	
	public int getX() {
		return x;
	}
}
