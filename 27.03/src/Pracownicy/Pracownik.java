package Pracownicy;

public class Pracownik implements Wynagrodzenia, Comparable<Pracownik>{
	protected String imieNazwisko;
	protected double pensja = 3000;
	
	public Pracownik(String imieNazwisko) {
		this.imieNazwisko = imieNazwisko;
	}

	public String getImieNazwisko() {
		return imieNazwisko;
	}
	
	@Override
	public double getPensja() {
		return pensja;
	}

	@Override
	public void zwiekszWynagrodzenie(double procent) {
		pensja = pensja+(pensja*(procent/100));
	}

	@Override
	public int compareTo(Pracownik p) {
		return Double.compare(this.getPensja(), p.getPensja());
	}
	

}
