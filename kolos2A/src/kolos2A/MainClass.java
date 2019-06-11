package kolos2A;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) throws TooHighVelocityException {
		ArrayList<Samoch�d> auta = new ArrayList<>();
		auta.add(new Osobowy(40));
		auta.add(new Ci�arowy(70));
		auta.add(new Osobowy(90));
		
		for(Samoch�d p: auta) {
			System.out.println(p.getPredkosc());
		}
		System.out.println();
		auta.get(0).przyspiesz(40);
		auta.get(1).przyspiesz(20);
		
		for(Samoch�d p: auta) {
			System.out.println(p.getPredkosc());
		}
	}

}
