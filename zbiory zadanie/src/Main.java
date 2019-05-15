import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Set<String> set = new HashSet<>();
		File plik = new File("Pan Tadeusz.txt");
		
		Scanner sc = new Scanner(plik);
		
		while(sc.hasNextLine()) {
			
			String line = sc.nextLine();
			Scanner lineScanner = new Scanner(line);
			lineScanner.useDelimiter(" ");
			while(lineScanner.hasNext()) {
				String word = lineScanner.next();
				if(!word.equals(" "))
					word = word.replaceAll("\\p{Punct}", "").toLowerCase();
					set.add(word);
			}
			
			lineScanner.close();
		}
		
		System.out.println(set);
		System.out.print("Liczba unikalnych s³ów: "+set.size());
		
		sc.close();
		
	}

}
