package lesson13;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

class MyClass<T2> extends CollectionTest<Integer,T2> {
	
}

class MyClass2<T1 extends Number,T2> extends CollectionTest<T1,T2> {
	
}

public class CollectionTest<Type extends java.lang.Number,Type2> {
	public Type	myVar;

	public Type2 calc(Type var) {
		return null;
	}
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		Iterable<String>	it = null;
		int[] x = null;

//		for (int item : x) {
//			
//		}
//		
//		for (String s : it) {
//			
//		}

		CollectionTest<Double,String>	ct;
		CollectionTest<Integer,Double>	c2;
		MyClass<Integer>				c12;
		MyClass2<Integer,Integer>		c13;
		
		List<String>	list = new ArrayList<String>();
		
		list.add("vassya");
		list.add("petya");
		list.add(1,"tanya");
		String	x1 = list.get(0);

		System.err.println("Val="+x1);
		for (String s : list) {
			System.err.println("Item="+s);
		}

		list.set(0,"abcde");
		String	xx = list.remove(1);
		
		for (String s : list) {
			System.err.println("Item[2]="+s);
		}
		
		Set<String>		ss = new HashSet<String>();
		
		System.err.println("Size="+ss.size());
		ss.add("vassya");
		ss.add("petya");
		ss.add("tanya");
		ss.add("vassya");
		ss.remove("vassya");
		
		System.err.println("? ="+ss.contains("vassya"));
		System.err.println("? ="+ss.contains("petya"));
		
		for (String s : ss) {
			System.err.println("Set item="+s);
		}
		
		ss.addAll(Arrays.asList("Ivan","Petr","tanya"));	// a U b
		System.err.println("Set: "+ss);

		ss.retainAll(Arrays.asList("Ivan","Petr","tanya","kim"));	// a ^ b
		System.err.println("Set[2]: "+ss);
		
		ss.removeAll(Arrays.asList("Ivan","Petr"));	// a - b
		System.err.println("Set[3]: "+ss);
		
		Class	cl = CollectionTest.class;
		Field	f = cl.getField("myVar");
		
		System.err.println("Field: "+f.getType());
		
		Map<String,Integer>		map = new HashMap<>();
		TreeMap<String,Integer>	tree;
//		Map<String,Map<String,Map<String,Integer>>>		map1 = new HashMap<>();
		
		System.err.println("Size="+map.size());
		map.put("ivanov", 21);
		map.put("petrov", 22);
		map.put("sidorov", 20);
		
		for (Entry<String, Integer> item : map.entrySet()) {
			System.err.println("Entry: "+item);
		}
		Integer	val = map.put("sidorov", 20);
		System.err.println("Map: "+map);
		val = map.get("ivanov");
		System.err.println("Val: "+val);
		
		System.err.println("COntains? "+map.containsKey("ivanov"));
		
		Properties	prop = new Properties();	// Map<String,String>

//		prop.load(inStream);		// key=value\n
//		prop.store(inStream,"");
		
	}
}
