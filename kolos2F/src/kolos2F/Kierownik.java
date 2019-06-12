package kolos2F;

public class Kierownik extends Pracownik {

	protected Kierownik(String imieNazwisko, int pensja) {
		super(imieNazwisko, pensja);
		
	}
	
	@Override
	protected int getPensja() {
		return pensja + pensja/2;
	}

}
