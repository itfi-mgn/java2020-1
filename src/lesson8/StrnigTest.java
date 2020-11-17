package lesson8;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StrnigTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String	s = "vassya";	// char  s[];  
		
		s += "123";
	
		System.err.println("Length: "+s.length());
		System.err.println("Char at: "+s.charAt(0));	// s[0]
		System.err.println("Index: "+s.indexOf('a'));
		System.err.println("Last index: "+s.lastIndexOf('a'));
		System.err.println("string Index: "+s.indexOf("as"));
		System.err.println("Second Index: "+s.indexOf('a',s.indexOf('a')+1));
		
		System.err.println("Substring: "+s.substring(0,2));
		System.err.println("Substring: "+s.substring(0,0));
		System.err.println("Substring: "+s.substring(3));
		
		System.err.println("Uppercase: "+s.toUpperCase());
		System.err.println("Lowercase: "+s.toLowerCase());
		System.err.println("Replace: "+s.replace('a','A'));
		System.err.println("Replace: "+s.replace("a",""));
	
		System.err.println("Equals: "+s.equals("vassya"));
		System.err.println("Equals: "+s.equals("vassya123"));
		
//		System.err.println("Equals: "+(s == "vassya123"));

		System.err.println("Equals ignore case: "+s.equalsIgnoreCase("VaSsYa123"));
		System.err.println("Equals: "+"vassya123".equals(s));
		
		System.err.println("Compare to: "+s.compareTo("a"));
		System.err.println("Compare to: "+s.compareTo("z"));
		System.err.println("Compare to: "+s.compareToIgnoreCase("Z"));

		char[]	content = s.toCharArray();
		System.err.println("Content: "+Arrays.toString(content));
		
		System.err.println("Content: "+new String(content));
		
		byte[]	byteContent = s.getBytes("UTF-8");
		System.err.println("byte Content: "+Arrays.toString(byteContent));
		
		System.err.println("byte Content: "+new String(byteContent,"UTF-8"));
		
		char[]	inner = new char[5];
		
		s.getChars(0, 4, inner, 0);
		System.err.println("extract : "+Arrays.toString(inner));
		
		StringBuilder	sb = new StringBuilder();
		System.err.println("Expression: "+sb.append("abcde=",1,3).append(12345).append(' ').append(true).substring(2));
		
		System.err.println("Expression: "+"abcde=".substring(1,3)+12345+' '+true);

		System.err.println("ReplaceAll: "+s.replaceAll("\\d*",""));
		System.err.println("Split: "+Arrays.toString(s.split("a")));

		int x = Integer.valueOf("12345");
		String xx = String.valueOf(x);
	}
}
