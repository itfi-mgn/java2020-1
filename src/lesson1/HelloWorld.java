package lesson1;

public class HelloWorld /*extends java.lang.Object*/ {
	protected static int x;
	// - ����������� ����
	// -- ������ ����� �����
	// --- byte		-128..127		(signed char)
	// --- short	-32768..32767	(signed short)
	// --- int		-2^31..2^31		(signed int)
	// --- long		-2^63..2^63		(signed long)
	// --- char		0..65536		(unsigned short)
	// -- ������ ������������ �����
	// --- float	1^-38..1^38, �� ����� 6 ���� (float)
	// --- double	1^-306..1^306, �� ����� 15 ���� (double)
	// - boolean	true, false		(int)
	// - ��������� ����
	protected static Object y;	// Object &y; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world");
	}
}
