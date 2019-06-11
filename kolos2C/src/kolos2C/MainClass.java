package kolos2C;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Kontrolka> kontrolki = new ArrayList<>();
		
		kontrolki.add(new Przycisk(20, 30, 100,100));
		kontrolki.add(new PoleEdycyjne(40, 200, 300, 100));
		
		for(Kontrolka k: kontrolki) {
			System.out.println(k.getRodzaj() +": szer: "+ k.getSzer() +", wys: "+ k.getWys() +" ("+ k.getX() +","+k.getY()+")");
		}
		
		System.out.println();
		
		for(Kontrolka k: kontrolki) {
			k.przesun(0, 5);
			k.zmienRozmiar(0, 10);
			System.out.println(k.getRodzaj() +": szer: "+ k.getSzer() +", wys: "+ k.getWys() +" ("+ k.getX() +","+k.getY()+")");
		}

	}

}
