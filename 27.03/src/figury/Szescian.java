package figury;

public class Szescian extends Bryla {
	private double bok;
	public Szescian(double bok) {
		super();
		this.bok = bok;
		rodzaj="sześcian";
	}

	@Override
	public double getPowierzchnia() {
		// TODO Auto-generated method stub
		return 6*Math.pow(bok, 2);
	}

	@Override
	public double getObjetosc() {
		// TODO Auto-generated method stub
		return Math.pow(bok, 3);
	}

}
