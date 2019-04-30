package figury;

public class Kula extends Bryla {
	private double promien;
	
	public Kula(double promien) {
		super();
		this.promien = promien;
		rodzaj="kula";
	}

	@Override
	public double getPowierzchnia() {
		// TODO Auto-generated method stub
		return 4*Math.PI*Math.pow(promien, 2);
	}

	@Override
	public double getObjetosc() {
		// TODO Auto-generated method stub
		return 4./3.*Math.PI*Math.pow(promien, 3);
	}

}
