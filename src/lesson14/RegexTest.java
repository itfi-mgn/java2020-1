package lesson14;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Pattern	p = Pattern.compile("a.*\\.(.*)");	// a*.*
		
		final Matcher	m = p.matcher("aliance.no");
		
		System.err.println("Matches? "+p.matcher("aliance.no").matches());
		
		System.err.println("Found? "+m.find());
		System.err.println("From="+m.regionStart());
		System.err.println("To="+m.regionEnd());
		System.err.println("Group="+m.group(1));
		
		System.err.println("as87cv,m23r0,sd4".replaceAll("\\d{2,2}",""));
		System.err.println(Arrays.toString("as87cv,m23r0,sd4".split("\\d{2,2}")));

	}

}
