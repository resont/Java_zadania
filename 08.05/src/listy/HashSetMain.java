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
			System.out.println("Stan si� zmieni�");
		if(!set.add("Eustachy"))
			System.out.println("Stan si� nie zmieni�");
		
		for(String s: set)
			System.out.println(s);
	}

}
