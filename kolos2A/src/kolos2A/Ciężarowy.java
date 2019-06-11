package kolos2A;

public class Ciê¿arowy extends Samochód {
	private int predkoscMAX = 80;
	
	protected Ciê¿arowy(int predkosc) throws TooHighVelocityException {
		if(predkosc > predkoscMAX) {
			throw new TooHighVelocityException();
		}else {
			this.predkosc = predkosc;
		}
	}
	@Override
	protected void przyspiesz(int przyspieszenie) throws TooHighVelocityException {
		if((predkosc + przyspieszenie) > predkoscMAX) {
			throw new TooHighVelocityException();
		}else {
			predkosc += przyspieszenie;
		}
	}
	@Override
	public int getPredkosc() {
		return predkosc;
	}
}
