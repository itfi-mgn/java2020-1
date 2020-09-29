package lesson1;

import java.io.InputStream;
//import java.lang.*;
//import lesson1.*;

public class HelloWorld /*extends Object*/ {
	protected static int x;
	// - примитивные типы
	// -- группа целых чисел
	// --- byte		-128..127		(signed char)
	// --- short	-32768..32767	(signed short)
	// --- int		-2^31..2^31		(signed int)
	// --- long		-2^63..2^63		(signed long)
	// --- char		0..65536		(unsigned short)
	// -- группа вещественных чисел
	// --- float	1^-38..1^38, не менее 6 цифр (float)
	// --- double	1^-306..1^306, не менее 15 цифр (double)
	// - boolean	true, false		(int)
	// - ссылочные типы
	protected static Object y;	// Object &y; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world");
		byte	b1 = 10, b2 = 20, b3 = (byte)(b1 + b2);
		
		System.err.println("b1+b2="+(b1+b2));
		System.err.println("b1-b2="+(b1-b2));
		System.err.println("b1*b2="+(b1*b2));
		System.err.println("b1/b2="+(b1/b2));
		System.err.println("b1%b2="+(b1%b2));

		System.err.println("b1|b2="+(b1|b2));
		System.err.println("b1&b2="+(b1&b2));
		System.err.println("b1^b2="+(b1^b2));
		System.err.println("~b1="+(~b1));
		
		System.err.println("b1<<2="+(b1<<2));
		System.err.println("b1>>2="+((-b1)>>2));
		System.err.println("b1>>>2="+((-b1)>>>2));
		
		System.err.println("b1<b2="+(b1<b2));
		System.err.println("b1<=b2="+(b1<=b2));
		System.err.println("b1>b2="+(b1>b2));
		System.err.println("b1>=b2="+(b1>=b2));
		System.err.println("b1==b2="+(b1==b2));
		System.err.println("b1!=b2="+(b1!=b2));
		
		double	d1 = 10, d2 = 20, d3 = b1 + b2;
		
		System.err.println("d1+d2="+(d1+d2));
		System.err.println("d1-d2="+(d1-d2));
		System.err.println("d1*d2="+(d1*d2));
		System.err.println("d1/d2="+(d1/d2));
		System.err.println("d1%d2="+(d1%d2));

//		System.err.println("d1|d2="+(d1|d2));
//		System.err.println("d1&d2="+(d1&d2));
//		System.err.println("d1^d2="+(d1^d2));
//		System.err.println("~d1="+(~d1));
//		
//		System.err.println("d1<<2="+(d1<<2));
//		System.err.println("d1>>2="+((-d1)>>2));
//		System.err.println("d1>>>2="+((-d1)>>>2));
		
		System.err.println("d1<d2="+(d1<d2));
		System.err.println("d1<=d2="+(d1<=d2));
		System.err.println("d1>d2="+(d1>d2));
		System.err.println("d1>=d2="+(d1>=d2));
		System.err.println("d1==d2="+(d1==d2));
		System.err.println("d1!=d2="+(d1!=d2));
		
		byte	x = 10;
		int		x1 = -100, x2 = 0xFEDA, x3 = 0b0110, x4 = 1_000_000, x5 = 077;
		long	val1 = 100, val2 = 1234567890123456L;
		float	f1 = 0.35f, f2 = 1.5e-3f;
		double	dd1 = 0.35, dd2 = 1.5e-3f;
		char	c1 = 10, c2 = '\r', c3 = 'a', c4 = '\070' , c5 = '\u0070';
		boolean	v1 = true, v2 = false;
		 
	}
}
