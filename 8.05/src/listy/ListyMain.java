package listy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListyMain {

	public static void main(String[] args) {
		List<String> lista = new LinkedList<>();
		lista.add("Adam");
		lista.add("Marian");
		lista.add("Stefan");
		
		for(String s: lista) //to jest konwertowane na iterator. Java nie ma for each
			System.out.println(s);
		System.out.println();
		
		Iterator<String> i = lista.listIterator();
		
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println();
		
		ListIterator<String> i2 = lista.listIterator();
		i2.next();
		i2.add("Maria");
		
		for(String s: lista)
			System.out.println(s);
		System.out.println();
		
		ListIterator<String> i3 = lista.listIterator();
		i3.next();
		i3.next();
		i3.remove();
		
		for(String s: lista) //usuwa mariê bo przez ni¹ "przechodzimy"
			System.out.println(s);
	}

}
