package listy;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Maniek");
		set.add("Romek");
		set.add("Eustachy");
		
		for(String s: set)
			System.out.println(s);
		
		System.out.println();
		set.add("Eustachy");
		
		for(String s: set)
			System.out.println(s);
		
		if(set.add("Maria"))
			System.out.println("Stan siê zmieni³");
		if(!set.add("Eustachy"))
			System.out.println("Stan siê nie zmieni³");
		
		for(String s: set)
			System.out.println(s);
	}

}
