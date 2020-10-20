package lesson4;

public class CloneClass implements Cloneable {
	
	@Override
	public CloneClass clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (CloneClass)super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		CloneClass	c1 = new CloneClass(), c2 = c1.clone();
	}

}
