package lesson3;

public class Vnuk extends ChildLifeTest {

	@Override
	public void itemPrint() {
		System.err.println("Vnuk item z="+this.z);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world x="+/*lesson3.ChildLifeTest.*/x);
		
		LigeCycleTest	item = new Vnuk();
		
		item.staticPrint();
		item.itemPrint();
		
	}
}
