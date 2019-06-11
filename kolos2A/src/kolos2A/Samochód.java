package kolos2A;

public abstract class Samochód {
	protected int predkosc;
	protected void przyspiesz(int przyspieszenie) throws TooHighVelocityException{
	}
	
	protected abstract int getPredkosc();

}
