package kolos2C;

public abstract class Kontrolka {
	protected int wys;
	protected int szer;
	protected String rodzaj;
	protected int x,y;
	
	protected void przesun(int x, int y) {
		this.x += x;
		this.y += y;
	}
	protected void zmienRozmiar(int wys, int szer) {
		this.wys += wys;
		this.szer += szer;
	}
	
	protected int getWys() {
		return wys;
	}
	protected int getSzer() {
		return szer;
	}
	protected String getRodzaj() {
		return rodzaj;
	}
	protected int getX() {
		return x;
	}
	protected int getY() {
		return y;
	}
}
