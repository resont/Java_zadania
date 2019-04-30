package Pracownicy;

import java.util.Arrays;
import java.util.Comparator;


public class MainClass {
	public static void main(String[] args) {
		class SortowaniePoPensjach implements Comparator<Pracownik>{

			@Override
			public int compare(Pracownik arg0, Pracownik arg1) {
				// TODO Auto-generated method stub
				return Double.compare(arg0.getPensja(), arg1.getPensja());
			}

		}
		class SortowanieAlfabetyczne implements Comparator<Pracownik>{

			@Override
			public int compare(Pracownik arg0, Pracownik arg1) {
				// TODO Auto-generated method stub
				return arg0.getImieNazwisko().compareTo(arg1.getImieNazwisko());
			}

		}
		Pracownik[] pracownicy=new Pracownik[4];
		pracownicy[0]=new Kierownik("Wiesiek");
		pracownicy[1]=new Kierownik("Mariusz");
		pracownicy[2]=new Pracownik("Czesiek");
		pracownicy[3]=new Pracownik("Romek");


	    Arrays.sort(pracownicy,new SortowaniePoPensjach());
	    
	    for(Pracownik p: pracownicy)
	    System.out.println(p.getImieNazwisko()+" "+p.getPensja());

		Arrays.sort(pracownicy,new SortowanieAlfabetyczne());

		for(Pracownik p: pracownicy)
		    System.out.println(p.getImieNazwisko()+" "+p.getPensja());
		
		for(Pracownik p: pracownicy)
		    p.zwiekszWynagrodzenie(50);
		for(Pracownik p: pracownicy)
		    System.out.println(p.getImieNazwisko()+" "+p.getPensja());
		


	}
	
}
