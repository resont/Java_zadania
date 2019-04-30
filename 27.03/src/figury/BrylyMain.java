package figury;

import java.util.Arrays;
import java.util.Comparator;

public class BrylyMain {
	
	public static void main(String[] args) {
		
		class PowierzchnieKomparator implements Comparator<Bryla>{

			@Override
			public int compare(Bryla bryla1, Bryla bryla2) {
				// TODO Auto-generated method stub
				return Double.valueOf(bryla1.getPowierzchnia()).compareTo(bryla2.getPowierzchnia());
			}
			
		}
		Bryla[] bryly=new Bryla[5];
		bryly[0]=new Kula(2);
		bryly[1]=new Szescian(2);
		bryly[2]=new Kula(2.5);
		bryly[3]=new Szescian(3);
		bryly[4]=new Kula(3);
		
		for(Bryla b: bryly)
			System.out.println(b.getRodzaj()+" "+b.getPowierzchnia()+
					" "+b.getObjetosc());
		
		Arrays.sort(bryly);
		System.out.println("------------------");

		for(Bryla b: bryly)
			System.out.println(b.getRodzaj()+" "+b.getPowierzchnia()+
					" "+b.getObjetosc());
		
		Arrays.sort(bryly,new PowierzchnieKomparator());
		System.out.println("------------------");

		for(Bryla b: bryly)
			System.out.println(b.getRodzaj()+" "+b.getPowierzchnia()+
					" "+b.getObjetosc());
		
		Arrays.sort(bryly,new Comparator<Bryla>() {

			@Override
			public int compare(Bryla bryla1, Bryla bryla2) {
				// TODO Auto-generated method stub
				return bryla1.getRodzaj().compareTo(bryla2.getRodzaj());
			}
		});
		System.out.println("------------------");

		for(Bryla b: bryly)
			System.out.println(b.getRodzaj()+" "+b.getPowierzchnia()+
					" "+b.getObjetosc());
		
		
	}
	
	

}
