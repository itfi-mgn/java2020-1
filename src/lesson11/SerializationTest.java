package lesson11;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		int[]	x = new int[] {1,2,3,4,5,6,7,8};
		
		try(final ByteArrayOutputStream	baos = new ByteArrayOutputStream();
			final ObjectOutputStream	dos = new ObjectOutputStream(baos)) {
			
			dos.writeInt(12345);
			dos.writeDouble(6.78);
			dos.writeChar('@');
			dos.writeUTF("qwert");
			dos.writeObject(x);
			Test	t = new Test();
			dos.writeObject(t);
			dos.reset();
			dos.writeObject(t);
			dos.flush();
			
			System.err.println("Content="+baos.toString());
			
	// ----------------- after one year... ----------------------------		
			try(final ByteArrayInputStream	bais = new ByteArrayInputStream(baos.toByteArray());
				final ObjectInputStream		dis = new ObjectInputStream(bais)) {
				
				System.err.println("int="+dis.readInt());
				System.err.println("double="+dis.readDouble());
				System.err.println("char="+dis.readChar());
				System.err.println("UTF="+dis.readUTF());
				System.err.println("Object="+Arrays.toString((int[])dis.readObject()));
				System.err.println("Object2="+dis.readObject());
				System.err.println("Object3="+dis.readObject());
			}
		}
	}
}

class Test implements Serializable {
	private static final long serialVersionUID = -1811600713933394735L;
	
	int	x = 10;
	double y = 20;
	String z = "test string";
	transient Object t = new Object();
	
	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
}
