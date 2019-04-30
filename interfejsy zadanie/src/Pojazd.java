
public abstract class Pojazd implements DaneTechniczne, DaneOgólne {
	protected String marka;
	protected int masa;
	
	protected Pojazd(String marka, int masa) {
		this.marka = marka;
		this.masa = masa;
	}

	@Override
	public String getMarka() {
		return marka;
	}

	@Override
	public int getMasaCalkowita() {
		return masa;
	}
	
	
	
}
