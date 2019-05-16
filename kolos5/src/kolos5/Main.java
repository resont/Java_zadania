package kolos5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		List<String> list = new LinkedList<>();
		Set<String> set = new HashSet<>();

		try(Scanner sc = new Scanner(new File("Clista.dat"))){
			while(sc.hasNextLine()) {
				list.add(sc.nextLine());
			}
			
			
		}
		
		System.out.println(list);
		
		try(Scanner sc = new Scanner(new File("Czbior.dat"))){
			while(sc.hasNextLine()) {
				set.add(sc.nextLine());
			}
			
			
		}
		
		System.out.println(set);
		
		ListIterator<String> i = list.listIterator();
		
		while(i.hasNext()) {
			String cos = i.next();
			if(set.contains(cos)) {
				i.remove();
			}
			
		}
		
		System.out.println(list);
	}

}
