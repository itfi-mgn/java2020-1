package lesson14;

import java.util.logging.Logger;

public class LoggerTest {
	static Logger	lt = Logger.getLogger(LoggerTest.class.getCanonicalName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger	logger = Logger.getGlobal();
		
		logger.severe("AAAAA");
	}
}
