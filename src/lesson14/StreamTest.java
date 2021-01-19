package lesson14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final List<String>	l = Arrays.asList("vassya","petya");
		
		Stream<String> s = l.stream();
		
		Stream<String> s1 = l.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return "vassya".equals(t);
			}
		});
		
		l.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return "vassya".equals(t);
			}
		}).forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.err.println("END: "+t);
			}
		});
		
		l.stream().filter((val)->"vassya".equals(val)).forEach((val)->System.err.println("AAA: "+val));
		
		for (String item : l) {
			if ("vassya".equals(item)) {
				System.err.println("AAA: "+item);
			}
		}

		
		
	}

}
