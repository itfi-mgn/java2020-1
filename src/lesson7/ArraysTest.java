package lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	x = new int[10], y = new int[] {1,2,6,5,4}, z = y.clone();
		int[]	t = x.clone(); 
		
		System.err.println("LEngth="+x.length);	// arraylength
		
		for (int index = 0; index < x.length; index++) {
			
		}
		
		int[][]	xx = new int[10][5], yy = new int[][] {new int[] {1,2}, null, new int[] {1,1,1,1}};
		int[][]	zz = xx;
		
		System.err.println("X[0]="+x[0]);
		t[0] = 100;
		System.err.println("X[0]="+x[0]);
		
		Class	cl = xx.getClass();
		
		System.err.println("name="+cl.getCanonicalName());
		System.err.println("isArray="+cl.isArray());
		System.err.println("content type="+cl.getComponentType());
		
		System.err.println("relect X[0]="+Array.getInt(x,0));
		Array.setInt(x,0,123);
		System.err.println("relect X[0] after="+Array.getInt(x,0));
		System.err.println("X[0]="+x[0]);
		
		int[]	abcde = (int[])Array.newInstance(int.class, 3);
		
		System.err.println("Len[x]="+Array.getLength(x));
		
		System.err.println("Length: "+abcde.length);

		int[]	a = (int[])concat(new int[] {1,2,3}, new int[] {4,5,6});
		
		System.err.println("A="+Arrays.toString(a));
	}
	
	static Object concat(Object... content) {	// (Object[] content)
		int		count = 0;
		
		for (Object item : content) {
			count += Array.getLength(item);
		}
		Object	result = Array.newInstance(content[0].getClass().getComponentType(), count);
		int		to = 0;
		
		for (Object item : content) {
			int	len = Array.getLength(item);
			
			System.arraycopy(item, 0, result, to, len);
			to += len;
		}
		return result;
	}
}
