
public class Prostokat extends Figura{
	private double wys,szer;
	public Prostokat(double wys,double szer) throws NegativeLengthException{
		if(wys<=0 || szer<=0)
			throw new NegativeLengthException();
		this.szer = szer;
		this.wys = wys;
		setRodzaj("Prostokat");
		
	}
	@Override
	protected double getPole(){
		return wys*szer;
	}
	@Override
	protected double getObwod(){
		return 2*(wys+szer);
	}

}
