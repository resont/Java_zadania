package kolos2B;

public class Konsultant extends Pracownik {
	private int liczbaKlientow = 1;
	
	protected Konsultant(String ImieNazwisko, int pensja) {
		this.ImieNazwisko = ImieNazwisko;
		this.pensja = pensja * getliczbaKlientow();
		
	}
	@Override
	public void setliczbaKlientow(int liczbaKlientow) {
		this.liczbaKlientow = liczbaKlientow;
		pensja *= getliczbaKlientow();
	}
	protected int getliczbaKlientow() {
		return liczbaKlientow;
	}
	@Override
	protected String getStanowisko() {
		return "Konsultant";
	}
}
