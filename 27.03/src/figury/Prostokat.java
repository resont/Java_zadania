package figury;

public class Prostokat extends Figura implements Powierzchnie {
	private double szer,wys;
	
	public Prostokat(double szer, double wys) {
		super();
		this.szer = szer;
		this.wys = wys;
		rodzaj="prostok¹t";
	}

	@Override
	public double getPowierzchnia() {
		// TODO Auto-generated method stub
		return szer*wys;
	}

}
