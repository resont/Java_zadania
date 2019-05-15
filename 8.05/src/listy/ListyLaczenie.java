package listy;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListyLaczenie {

	public static void main(String[] args) {
		List<String> lista = new LinkedList<>();
		lista.add("Adam");
		lista.add("Marian");
		lista.add("Stefan");
		lista.add("Rafa³");
		
		List<String> lista2 = new LinkedList<>();
		lista2.add("Piotrek");
		lista2.add("Maciek");
		lista2.add("Szymon");
		
		ListIterator<String> i = lista.listIterator();
		ListIterator<String> i2 = lista2.listIterator();
		
		while(i2.hasNext()) {
			i.next();
			i.add(i2.next());
		}
		
		while(i.hasNext()){
			i.next();
			i.remove();
		}
		
		for(String s: lista)
			System.out.println(s);

	}

}
