
public class Kolo extends Figura{
	private double promien;
	public Kolo(double promien) throws NegativeLengthException{
		if(promien<=0)
			throw new NegativeLengthException();
		this.promien = promien;
		setRodzaj("Kolo");
	}
	@Override
	protected double getPole() {
		return Math.PI*2*this.promien;
	}

	@Override
	protected double getObwod() {
		return Math.PI*2*this.promien;
	}

}
