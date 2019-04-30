package Pracownicy;

public class Kierownik extends Pracownik{
	
	private double DODATEK = pensja*0.5;

	public Kierownik(String imieNazwisko) {
		super(imieNazwisko);
	}
	
	@Override
	public double getPensja() {
		return pensja+DODATEK;
	}

	@Override
	public void zwiekszWynagrodzenie(double procent) {
		pensja = pensja+(pensja*(procent/100));
		DODATEK = DODATEK+(DODATEK*(procent/100));
	}
	
	
	
}