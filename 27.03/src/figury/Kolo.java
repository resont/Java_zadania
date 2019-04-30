package figury;

public class Kolo extends Figura implements Powierzchnie {
	private double promien;
	
	public Kolo(double promien) {
		super();
		this.promien = promien;
		rodzaj="ko³o";
	}

	@Override
	public double getPowierzchnia() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(promien, 2);
	}

}
