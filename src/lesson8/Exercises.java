package lesson8;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	s1 = "abcdefg";
		// TODO: make "AbCdEfG"
		StringBuilder	sb = new StringBuilder();		// 90% 
		
		for (int index = 0; index < s1.length(); index++) {
			char	symbol = s1.charAt(index);
			
			sb.append(index % 2 == 0 ? Character.toUpperCase(symbol) : Character.toLowerCase(symbol));
		}
		System.err.println(sb.toString());
		
		// ------------------------------------------------
		
		char[]	content = s1.toCharArray();	// 10%
		
		for (int index = 0; index < content.length; index++) {
			if (index % 2 == 0) {
				content[index] = Character.toUpperCase(content[index]);
			}
			else {
				content[index] = Character.toLowerCase(content[index]);
			}
		}
		System.err.println(new String(content));
		
		// String s1 = "12+34+56";
	}

}
