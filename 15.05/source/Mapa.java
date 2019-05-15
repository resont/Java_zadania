package source;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Mapa {
	public static void main(String[] args) throws FileNotFoundException {
		Map<String,Osoba> osobyMap = new HashMap<>();
	
		try (Scanner sc = new Scanner(new File("osoby.dat"))) {
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				StringTokenizer st = new StringTokenizer(s);
				String peselOsoby =  st.nextToken();
				String imieOsoby = st.nextToken();
				String nazwiskoOsoby = st.nextToken();
				osobyMap.put(peselOsoby, new Osoba(imieOsoby,nazwiskoOsoby));
				
				
				
//				for (String klucz: osobyMap.keySet()) {
//					System.out.println(klucz);
//				}
//				
//				
//				for (Osoba os: osobyMap.values()) {
//					System.out.println(os);
//				}
				
			

			}
			System.out.println(osobyMap.get("432"));

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

class Osoba {
	private String imie,nazwisko;
	
	public Osoba(String imie, String nazwisko) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	@Override
	public String toString() {
		return imie+" "+nazwisko;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(imie,nazwisko);
		
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (arg0 == null) return false;
		if (this == arg0) return true;
		if (!getClass().equals(arg0.getClass())) return false;
		
//		Osoba o = (Osoba)arg0;
		return this.imie.equals(imie) && this.nazwisko.equals(nazwisko);
	}
}
