
public class Czlowiek implements Personalia {

	protected String imie;
	protected String nazwisko;
	
	public Czlowiek(String imie, String nazwisko){
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	@Override
	public String getImie() {
		return imie;
	}

	@Override
	public String getNazwisko() {
		return nazwisko;
	}

}
