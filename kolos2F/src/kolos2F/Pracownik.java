package kolos2F;

public class Pracownik {
	protected String imieNazwisko;
	protected int pensja;
	
	protected Pracownik(String imieNazwisko, int pensja) {
		this.imieNazwisko = imieNazwisko;
		this.pensja = pensja;
	}
	
	protected int getPensja() {
		return pensja;
	}
	protected String getImieNazwisko() {
		return imieNazwisko;
	}
	protected void zwiekszWynagrodzenie(int procent) {
		pensja += pensja * procent/100;
	}
}
