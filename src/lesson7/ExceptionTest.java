package lesson7;

import java.io.IOException;

public class ExceptionTest {
	static void test(int code) throws IOException {
		try{error(code);
		} catch (Throwable e) {
			throw new IOException(e);
		}
	}
	
	static void error(int code) throws RuntimeException, Exception, Throwable {
		switch (code) {
			case 0 	: throw new RuntimeException("Simulate runtime");
			case 1 	: throw new Exception("Simulate exception");
			case 2 	: throw new Throwable("Simulate throwable");
			default	: return;
		}
	}

	static void nestedError(int code) throws RuntimeException, Throwable {
		try{error(code);
			// System.err.println("Nested finally");
		} catch (Exception exc) {
			System.err.println("Catch nested exception!"+exc.getMessage());
			// System.err.println("Nested finally");
		} finally {
			System.err.println("Nested finally");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwable	t = new Throwable("kjdksjklfdfj");
		// - Error (unchecked)
		// -- /////
		// - Exception
		// -- /////
		// -- RuntimeException (unchecked)
		// --- ////
		
		for (int index = 0; index <= 3; index++) {
			try {
				nestedError(index);
				System.err.println("Success");
				// ideal program
			} catch (NullPointerException | IllegalArgumentException exc/*Exception ?????*/) {
				System.err.println("Catch runtime!"+exc.getMessage());
			} catch (RuntimeException exc/*Exception ?????*/) {
				System.err.println("Catch runtime!"+exc.getMessage());
				// process error
			} catch (Exception exc/*Exception ?????*/) {
				System.err.println("Catch exception!"+exc.getMessage());
				// process error
			} catch (Throwable exc/*Exception ?????*/) {
				System.err.println("Catch throwable!"+exc.getMessage());
				exc.printStackTrace();
				// process error
			} finally {
				System.err.println("Finally");
				// actions
			}
		}
	}

}
