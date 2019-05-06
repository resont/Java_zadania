
public class Pracownik implements Wynagrodzenia {
	protected String imie;
	protected String nazwisko;
	int pensja;
	
	public Pracownik(String imie, String nazwisko,int pensja){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.pensja = pensja;
	}
	
	@Override
	public int getPensja() {
		// TODO Auto-generated method stub
		return pensja;
	}

}
