package lesson4;

public class Exercises2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeCycleInterface	lc = null;// ????
		MoreLessInterface	ml = null;// ???
		
		lc.start();
		System.err.println("Started");
		lc.suspend();
		System.err.println("Suspended");
		lc.resume();
		System.err.println("Resumed");
		lc.stop();
		System.err.println("Stopped");

		ml.more();
		System.err.println("More");
		ml.less();
		System.err.println("L");
		
	}

}
