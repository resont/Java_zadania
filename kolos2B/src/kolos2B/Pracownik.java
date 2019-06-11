package kolos2B;

public abstract class Pracownik {
	
	protected String ImieNazwisko;
	protected int pensja;
	
	protected String getImieNazwisko() {
		return ImieNazwisko;
	}
	protected abstract String getStanowisko();
	protected int getPensja() {
		return pensja;
	}
	
	public void setLiczbaProjektow(int liczbaProjektow) {
		
	}
	public void setliczbaKlientow(int liczbaKlientow) {
		
	}
	
}
